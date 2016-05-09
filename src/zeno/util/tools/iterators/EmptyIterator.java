package zeno.util.tools.iterators;

import java.util.Iterator;

/**
 * The {@code EmptyIterator} class terminates immediately.
 * 
 * @author Zeno
 * @since Nov 20, 2104
 * @param <O>  the object type
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