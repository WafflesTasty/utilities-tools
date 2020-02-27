package zeno.util.tools.helper.iterators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/**
 * The {@code CombineIterator} combines multiple iterables into one {@code Iterator}.
 *
 * @author Zeno
 * @since 28 Feb 2020
 * @version 1.0
 *
 *
 * @param <O>  an object type to iterate
 * @see Iterator
 */
public class CombineIterator<O> implements Iterator<O>
{
	private Iterator<O> current;
	private Queue<Iterable<O>> queue;
	
	/**
	 * Creates a new {@code CombineIterator}.
	 * 
	 * @param set  a set of iterables
	 * 
	 * 
	 * @see Iterable
	 */
	public CombineIterator(Iterable<O>... set)
	{
		queue = new ArrayDeque<>();
		for(Iterable<O> iter : set)
		{
			queue.add(iter);
		}
		
		Iterable<O> iter = queue.poll();
		if(iter != null)
		{
			current = iter.iterator();
			find();
		}
	}
	
	
	private void find()
	{
		if(!current.hasNext())
		{
			Iterable<O> iter = queue.poll();
			if(iter == null)
				current = null;
			else
			{
				current = iter.iterator();
				find();
			}
		}
	}
	
	@Override
	public void remove()
	{
		current.remove();
	}
	
	@Override
	public boolean hasNext()
	{
		return current != null;
	}
	
	@Override
	public O next()
	{
		O next = current.next();
		find(); return next;
	}
}