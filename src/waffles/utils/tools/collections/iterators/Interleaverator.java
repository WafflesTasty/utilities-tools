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
	private List<Iterator<O>> list;
	
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
		list = new ArrayList<>();
		for(Iterable<O> l : leaves)
		{
			Iterator<O> i = l.iterator();
			if(i.hasNext())
			{
				list.add(i);
			}
		}
	}
	
	/**
	 * Creates a new {@code Interleavable}.
	 * 
	 * @param leaves  a set of leaves
	 * 
	 * 
	 * @see Iterator
	 */
	public Interleaverator(Iterator<O>... leaves)
	{
		list = new ArrayList<>();
		for(Iterator<O> i : leaves)
		{
			if(i.hasNext())
			{
				list.add(i);
			}
		}
	}

	
	@Override
	public boolean hasNext()
	{
		return !list.isEmpty();
	}

	@Override
	public O next()
	{
		Iterator<O> iter = list.get(curr);

		O next = iter.next();
		if(!iter.hasNext())
			list.remove(curr);
		else
			curr++;
		
		if(curr == list.size())
		{
			curr = 0;
		}	

		return next;
	}
}