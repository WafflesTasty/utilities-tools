package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

import waffles.utils.tools.patterns.properties.values.Valuable;

/**
 * A {@code ValueIterator} iterates over the values of a set of {@code Valuables}.
 *
 * @author Waffles
 * @since 28 Sep 2024
 * @version 1.1
 *
 *
 * @param <V>  a value type
 */
public class ValueIterator<V> implements Iterator<V>
{
	private Iterator<? extends Valuable<V>> source;
	
	/**
	 * Creates a new {@code ValueIterator}.
	 * 
	 * @param src  a valuable source
	 * 
	 * 
	 * @see Iterable
	 * @see Valuable
	 */
	public ValueIterator(Iterable<? extends Valuable<V>> src)
	{
		source = src.iterator();
	}

	
	@Override
	public boolean hasNext()
	{
		return source.hasNext();
	}

	@Override
	public V next()
	{
		return source.next().Value();
	}
}