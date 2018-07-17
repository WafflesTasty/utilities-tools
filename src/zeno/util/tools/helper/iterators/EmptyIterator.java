package zeno.util.tools.helper.iterators;

import java.util.Iterator;

/**
 * The {@code EmptyIterator} class terminates immediately.
 * 
 * @author Zeno
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  an iterator object type
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