package waffles.utils.tools.collections.iterators.counters;

import java.util.Iterator;

import waffles.utils.tools.primitives.Integers;

/**
 * A {@code ModCounter} iterates over modulo integer values.
 *
 * @author Waffles
 * @since May 5, 2016
 * @version 1.0
 * 
 * 
 * @see Iterator
 * @see Integer
 */
public class ModCounter implements Iterator<Integer>
{
	private int next;
	private int max, mod;
	
	/**
	 * Creates a new {@code ModCounter}.
	 * 
	 * @param mod  a modulus
	 */
	public ModCounter(int mod)
	{
		this(Integers.MAX_VALUE, mod);
	}
	
	/**
	 * Creates a new {@code ModCounter}.
	 * 
	 * @param max  a maximum count
	 * @param mod  a modulus
	 */
	public ModCounter(int max, int mod)
	{
		this.max = max;
		this.mod = mod;
	}
		
	
	@Override
	public boolean hasNext()
	{
		return next <= max;
	}

	@Override
	public Integer next()
	{
		return Integers.mod(next++, mod);
	}
}