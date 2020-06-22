package zeno.util.tools.helper.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The {@code Interleavable} class interleaves a set of {@code Iterables}.
 *
 * @author Zeno
 * @since 22 Jun 2020
 * @version 1.1 
 *
 * @param <O>  an iteration type
 * 
 * 
 * @see Iterable
 */
public class Interleavable<O> implements Iterable<O>
{
	private int curr;
	private List<Iterator<O>> iters;
	
	/**
	 * Creates a new {@code Interleavable}.
	 * 
	 * @param leaves  a set of leaves
	 * 
	 * 
	 * @see Iterable
	 */
	public Interleavable(Iterable<O>... leaves)
	{
		iters = new ArrayList<>();
		for(Iterable<O> leaf : leaves)
		{
			Iterator<O> iter = leaf.iterator();
			if(iter.hasNext())
			{
				iters.add(iter);
			}
		}
	}

	
	@Override
	public Iterator<O> iterator()
	{
		return new Iterator<>()
		{
			@Override
			public boolean hasNext()
			{
				return !iters.isEmpty();
			}

			@Override
			public O next()
			{
				Iterator<O> iter = iters.get(curr);

				O next = iter.next();
				if(!iter.hasNext())
					iters.remove(curr);
				else
					curr++;

				return next;
			}
		};
	}
}