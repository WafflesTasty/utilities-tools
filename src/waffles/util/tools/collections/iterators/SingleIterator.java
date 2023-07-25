package waffles.util.tools.collections.iterators;

import java.util.Iterator;

/**
 * The {@code SingleIterator} class terminates after iterating one object.
 *  
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class SingleIterator<O> implements Iterator<O>
{
	private O object;
	
	/**
	 * Creates a new {@code SingleIterator}.
	 * 
	 * @param source  an iterable source
	 * 
	 * 
	 * @see Iterable
	 */
	public SingleIterator(Iterable<O> source)
	{
		Iterator<O> iter = source.iterator();
		if(iter.hasNext())
		{
			object = iter.next();
		}
	}
	
	/**
	 * Creates a new {@code SingleIterator}.
	 * 
	 * @param object  a target object
	 */
	public SingleIterator(O object)
	{
		this.object = object;
	}
	
	
	@Override
	public boolean hasNext()
	{
		return object != null;
	}

	@Override
	public O next()
	{
		O next = object;
		object = null;
		return next;
	}
}