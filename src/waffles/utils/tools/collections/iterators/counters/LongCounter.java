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
	private long next, maximum;
	
	/**
	 * Creates a new {@code LongCounter}.
	 * 
	 * @param max  a maximum count
	 */
	public LongCounter(long max)
	{
		maximum = max; next = 0;
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
		return next != maximum;
	}

	@Override
	public Long next()
	{
		return next++;
	}
}