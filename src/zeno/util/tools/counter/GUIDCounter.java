package zeno.util.tools.counter;

import java.util.Iterator;

/**
 * The {@code GUIDCounter} class creates a counter for prefixed long values.
 *
 * @author Zeno
 * @since May 5, 2016
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
		return next != Long.MAX_VALUE;
	}

	@Override
	public String next()
	{
		return prefix + (++next);
	}
}