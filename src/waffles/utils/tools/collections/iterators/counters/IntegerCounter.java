package waffles.utils.tools.collections.iterators.counters;

import java.util.Iterator;

import waffles.utils.tools.primitives.Integers;

/**
 * The {@code IntegerCounter} iterates indefinitely over positive integer values.
 *
 * @author Waffles
 * @since May 5, 2016
 * @version 1.0
 * 
 * 
 * @see Iterator
 * @see Integer
 */
public class IntegerCounter implements Iterator<Integer>
{
	private int next, max;
	
	/**
	 * Creates a new {@code IntegerCounter}.
	 * 
	 * @param m  a maximum count
	 */
	public IntegerCounter(int m)
	{
		max = m; next = 0;
	}
	
	/**
	 * Creates a new {@code IntegerCounter}.
	 */
	public IntegerCounter()
	{
		this(Integers.MAX_VALUE);
	}
	
	
	@Override
	public boolean hasNext()
	{
		return next <= max;
	}

	@Override
	public Integer next()
	{
		return next++;
	}
}