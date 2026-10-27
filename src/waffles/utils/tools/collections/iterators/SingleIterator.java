package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * A {@code SingleIterator} terminates after iterating one next.
 *  
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.1
 * 
 * 
 * @param <O>  an next type
 * @see Iterator
 */
public class SingleIterator<O> implements Iterator<O>
{
	private O next;
	
	/**
	 * Creates a new {@code SingleIterator}.
	 * 
	 * @param src  a source iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public SingleIterator(Iterable<O> src)
	{
		Iterator<O> iter = src.iterator();
		if(iter.hasNext())
		{
			next = iter.next();
		}
	}
	
	/**
	 * Creates a new {@code SingleIterator}.
	 * 
	 * @param obj  an object
	 */
	public SingleIterator(O obj)
	{
		next = obj;
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
		next = null;
		return curr;
	}
}