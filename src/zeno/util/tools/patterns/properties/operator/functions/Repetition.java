package zeno.util.tools.patterns.properties.operator.functions;

import zeno.util.tools.patterns.properties.operator.Operation;

/**
 * The {@code Repetition} class defines a repeat {@code Operation}.
 * The object stored in the operation is simply returned.
 *
 * @author Zeno
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  the type of the result
 * @see Operation
 */
public class Repetition<O> implements Operation<O>
{
	private O object;
	
	/**
	 * Creates a new {@code Repetition}.
	 * 
	 * @param o  an object to return
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
