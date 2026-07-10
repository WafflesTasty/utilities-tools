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
	private O next;
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
		src = s;
		set = s.iterator();
		next = findNext();
	}
	
	
	private O findNext()
	{
		if(set.hasNext())
		{
			return set.next();
		}
		
		set = src.iterator();
		if(!set.hasNext())
		{
			return null;
		}
		
		return next();		
	}

	@Override
	public boolean hasNext()
	{
		return next != null;
	}

	@Override
	public O next()
	{
		O curr = next;
		next = findNext();
		return next();
	}	
}