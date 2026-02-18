package waffles.utils.tools.collections.iterators.counters;

import java.util.Iterator;

/**
 * The {@code LongCounter} iterates indefinitely over positive long values.
 *
 * @author Waffles
 * @since May 5, 2016
 * @version 1.0
 * 
 * 
 * @see Iterator
 * @see Long
 */
public class LongCounter implements Iterator<Long>
{
	private long next, max;
	
	/**
	 * Creates a new {@code LongCounter}.
	 * 
	 * @param m  a maximum count
	 */
	public LongCounter(long m)
	{
		max = m; next = 0;
	}
	
	/**
	 * Creates a new {@code LongCounter}.
	 */
	public LongCounter()
	{
		next = 0;
	}
	
	
	@Override
	public boolean hasNext()
	{
		return next <= max;
	}

	@Override
	public Long next()
	{
		return next++;
	}
}