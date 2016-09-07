package zeno.util.tools.iterators;

import java.util.Iterator;

/**
 * The {@code EmptyIterator} class terminates immediately.
 * 
 * @param <O>  an iterator object type
 * 
 * @since Nov 20, 2014
 * @author Zeno
 * 
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