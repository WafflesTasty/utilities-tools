package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * The {@code CastIterator} iterates over a {@code Collection} and casts the objects.
 * 
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class CastIterator<O> implements Iterator<O>
{
	private int iCurr;
	private Object next;
	private Iterator<?>[] objects;
		
	/**
	 * Creates a new {@code ReverseIterator}.
	 * 
	 * @param set  a set to iterate
	 * 
	 * 
	 * @see Iterable
	 */
	public CastIterator(Iterable<?>... set)
	{
		objects = new Iterator[set.length];
		for(int i = 0; i < set.length; i++)
		{
			objects[i] = set[i].iterator();
		}
		
		next = findNext();
	}
	
	
	private Object findNext()
	{
		Iterator<?> i = objects[iCurr];
		if(i.hasNext())
		{
			return i.next();
		}
		
		iCurr++;
		if(iCurr < objects.length)
		{
			return findNext();
		}
		
		return null;
	}
	
	@Override
	public boolean hasNext()
	{
		return next != null;
	}

	@Override
	public O next()
	{
		O curr = (O) next;
		next = findNext();
		return curr;
	}
}