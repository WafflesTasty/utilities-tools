package waffles.utils.tools.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The {@code Interleaverator} interleaves a set of {@code Iterators}.
 *
 * @author Waffles
 * @since 22 Jun 2020
 * @version 1.1 
 *
 * @param <O>  an object type
 * 
 * 
 * @see Iterator
 */
public class Interleaverator<O> implements Iterator<O>
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
	public Interleaverator(Iterable<O>... leaves)
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
		
		if(curr == iters.size())
		{
			curr = 0;
		}	

		return next;
	}
}