package waffles.util.tools.collections.iterators;

import java.util.Iterator;

/**
 * The {@code EmptyIterator} terminates immediately without iterating.
 * 
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class EmptyIterator<O> implements Iterator<O>
{
	@Override
	public boolean hasNext()
	{
		return false;
	}

	@Override
	public O next()
	{
		return null;
	}
}