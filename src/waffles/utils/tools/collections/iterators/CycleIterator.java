package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * A {@code CycleIterator} infinitely cycles through the same iterator.
 *
 * @author Waffles
 * @since Jul 10, 2026
 * @version 1.1
 *
 *
 * @param <O>  an object type
 * @see Iterator
 */
public class CycleIterator<O> implements Iterator<O>
{
	private Iterator<O> set;
	private Iterable<O> src;
	
	/**
	 * Creates a new {@code CycleIterator}.
	 * 
	 * @param s  an iterable source
	 * 
	 * 
	 * @see Iterable
	 */
	public CycleIterator(Iterable<O> s)
	{
		set = s.iterator();
		src = s;
	}
	
	
	@Override
	public boolean hasNext()
	{
		return set.hasNext();
	}

	@Override
	public O next()
	{
		O next = set.next();
		if(!set.hasNext())
		{
			set = src.iterator();
		}
		
		return next;
	}	
}