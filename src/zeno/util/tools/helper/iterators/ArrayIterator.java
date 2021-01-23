package zeno.util.tools.helper.iterators;

import java.util.Iterator;

/**
 * The {@code ArrayIterator} class iterates over an {@code Array}.
 *
 * @author Zeno
 * @since Apr 30, 2016
 * @version 1.0
 * 
 * 
 * @param <O>  an iterator object type
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