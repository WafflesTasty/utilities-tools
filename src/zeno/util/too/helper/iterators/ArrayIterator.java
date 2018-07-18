package zeno.util.too.helper.iterators;

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
	private int index;
	private Object[] objects;
	
	/**
	 * Creates a new {@code ArrayIterator}.
	 * 
	 * @param objects  an array to use
	 */
	public ArrayIterator(O[] objects)
	{
		this.objects = objects;
	}
	
	@Override
	public boolean hasNext()
	{
		return index < objects.length;
	}

	@Override
	public O next()
	{
		return (O) objects[index++];
	}
}