package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * An {@code ArrayIterator} iterates over an {@code Array}, optionally skipping null values.
 *
 * @author Waffles
 * @since Apr 30, 2016
 * @version 1.0
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class ArrayIterator<O> implements Iterator<O>
{
	private int next;
	private Object[] objects;
	private boolean skipNulls;
	
	/**
	 * Creates a new {@code ArrayIterator}.
	 * 
	 * @param objects  an array to use
	 * @param skipNulls  a null state handler
	 */
	public ArrayIterator(Object[] objects, boolean skipNulls)
	{
		this.skipNulls = skipNulls;
		this.objects = objects;
		this.next = -1;
		findNext();
	}
	
	/**
	 * Creates a new {@code ArrayIterator}.
	 * 
	 * @param objects  an array to use
	 */
	public ArrayIterator(Object[] objects)
	{
		this(objects, false);
	}
	
	
	private void findNext()
	{
		if(objects == null)
		{
			return;
		}
		
		next++;
		if(next == objects.length)
		{
			next = -1;
			return;
		}
		
		if(skipNulls && objects[next] == null)
		{
			findNext();
		}
	}
	
	@Override
	public boolean hasNext()
	{
		return next != -1;
	}

	@Override
	public O next()
	{
		O oNext = (O) objects[next];
		findNext(); return oNext;
	}
}