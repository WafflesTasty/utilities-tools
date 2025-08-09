package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

import waffles.utils.tools.patterns.Computable;

/**
 * The {@code ConvertIterator} iterates over a {@code Collection} and converts the objects.
 * 
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <I>  an input type
 * @param <O>  an output type
 * @see Computable
 * @see Iterator
 */
public abstract class ConvertIterator<I, O> implements Computable<I, O>, Iterator<O>
{
	private int iCurr;
	private Object next;
	private Iterator<?>[] objects;
		
	/**
	 * Creates a new {@code ConvertIterator}.
	 * 
	 * @param set  a set to iterate
	 * 
	 * 
	 * @see Iterable
	 */
	public ConvertIterator(Iterable<?>... set)
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
		O curr = compute((I) next);
		next = findNext();
		return curr;
	}
}