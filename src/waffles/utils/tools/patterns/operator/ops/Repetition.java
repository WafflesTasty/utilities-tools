package waffles.utils.tools.patterns.operator.ops;

import waffles.utils.tools.patterns.operator.Operation;

/**
 * The {@code Repetition} class defines a repeating {@code Operation}.
 * </br> The object stored in the operation is simply returned as-is.
 *
 * @author Waffles
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  a result type
 * @see Operation
 */
public class Repetition<O> implements Operation<O>
{
	private O object;
	
	/**
	 * Creates a new {@code Repetition}.
	 * 
	 * @param o  an object to repeat
	 */
	public Repetition(O o)
	{
		object = o;
	}
	
	
	@Override
	public O result()
	{
		return object;
	}

	@Override
	public int cost()
	{
		return 0;
	}
}
