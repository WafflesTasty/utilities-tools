package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * An {@code ArrayIterator} iterates over an {@code Array}, optionally skipping null values.
 *
 * @author Waffles
 * @since Apr 30, 2016
 * @version 1.1
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class ArrayIterator<O> implements Iterator<O>
{
	private int next;
	private Object[] data;
	private boolean skipNulls;
	
	/**
	 * Creates a new {@code ArrayIterator}.
	 * 
	 * @param array  an array to use
	 * @param skip  a null skip state
	 */
	public ArrayIterator(Object[] array, boolean skip)
	{
		next = -1;
		data = array;
		skipNulls = skip;
		next = findNext();
	}
	
	/**
	 * Creates a new {@code ArrayIterator}.
	 * 
	 * @param array  an array to use
	 */
	public ArrayIterator(Object[] array)
	{
		this(array, false);
	}
	
	
	private int findNext()
	{
		if(data == null)
		{
			return -1;
		}
		
		next++;
		if(data.length <= next)
		{
			return -1;
		}
		
		if(data[next] == null && skipNulls)
		{
			return findNext();
		}

		return next;
	}
	
	@Override
	public boolean hasNext()
	{
		return next != -1;
	}

	@Override
	public O next()
	{
		O curr = (O) data[next];
		next = findNext();
		return curr;
	}
}