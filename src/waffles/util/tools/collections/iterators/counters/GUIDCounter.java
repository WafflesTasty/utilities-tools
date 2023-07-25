package waffles.util.tools.collections.iterators.counters;

import java.util.Iterator;

import waffles.util.tools.primitives.Longs;

/**
 * The {@code GUIDCounter} iterates indefinitely over prefixed long values.
 *
 * @author Waffles
 * @since May 5, 2016
 * @version 1.0
 * 
 * 
 * @see Iterator
 * @see String
 */
public class GUIDCounter implements Iterator<String>
{
	private long next;
	private String prefix;
	
	/**
	 * Creates a new {@code GUIDCounter}.
	 * 
	 * @param pref  a string prefix
	 * 
	 * 
	 * @see String
	 */
	public GUIDCounter(String pref)
	{
		prefix = pref;
		next = 0;
	}
	
	@Override
	public boolean hasNext()
	{
		return next != Longs.MAX_VALUE;
	}

	@Override
	public String next()
	{
		return prefix + (next++);
	}
}