package zeno.util.tools.iterators;

import java.util.Collection;
import java.util.Iterator;

/**
 * The {@code ReverseIterator} class iterates over a {@code Collection} in reverse order.
 * 
 * @param <O>  an iterator object type
 * 
 * @since Nov 20, 2014
 * @author Zeno
 * 
 * @see Iterator
 */
public class ReverseIterator<O> implements Iterator<O>
{
	private int index;
	private Object[] objects;
		
	/**
	 * Creates a new {@code ReverseIterator}.
	 * 
	 * @param objects  a collection to iterate
	 * @param index  an index to start from
	 * @see Collection
	 */
	public ReverseIterator(Collection<O> objects, int index)
	{
		this(objects.toArray(), index);
	}
	
	/**
	 * Creates a new {@code ReverseIterator}.
	 * 
	 * @param objects  an array to iterate
	 * @param index  an index to start from
	 * @see Object
	 */
	public ReverseIterator(Object[] objects, int index)
	{
		this.objects = objects;
		this.index = index;
	}

	
	/**
	 * Creates a new {@code ReverseIterator}.
	 * 
	 * @param objects  a collection to iterate
	 * @see Collection
	 */
	public ReverseIterator(Collection<O> objects)
	{
		this(objects.toArray(), objects.size());
	}
			
	/**
	 * Creates a new {@code ReverseIterator}.
	 * 
	 * @param objects  an array to iterate
	 * @see Object
	 */
	public ReverseIterator(O[] objects)
	{
		this(objects, objects.length);
	}
	
	
	@Override
	public boolean hasNext()
	{
		return index > 0;
	}

	@Override
	public O next()
	{
		return (O) objects[--index];
	}
}