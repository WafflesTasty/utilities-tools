package zeno.util.tools.helper.iterators.counters;

import java.util.Iterator;

import zeno.util.tools.Integers;

/**
 * The {@code IntegerCounter} class creates a counter for integer values.
 *
 * @author Zeno
 * @since May 5, 2016
 * @version 1.0
 * 
 * 
 * @see Iterator
 * @see Integer
 */
public class IntegerCounter implements Iterator<Integer>
{
	private int next, maximum;
	
	/**
	 * Creates a new {@code IntegerCounter}.
	 * 
	 * @param max  a maximum count
	 */
	public IntegerCounter(int max)
	{
		maximum = max; next = 0;
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
		return next != maximum;
	}

	@Override
	public Integer next()
	{
		return next++;
	}
}