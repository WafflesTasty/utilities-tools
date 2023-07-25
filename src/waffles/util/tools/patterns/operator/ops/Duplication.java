package waffles.util.tools.patterns.operator.ops;

import waffles.util.tools.patterns.operator.Operation;
import waffles.util.tools.patterns.semantics.Copyable;
import waffles.util.tools.primitives.Integers;

/**
 * The {@code Duplication} class defines a copying {@code Operation}.
 * </br> The object stored in the operation is copied and then returned.
 *
 * @author Waffles
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  a result type
 * @see Operation
 * @see Copyable
 */
public class Duplication<O extends Copyable<O>> implements Operation<O>
{
	private O object;
	
	/**
	 * Creates a new {@code Duplication}.
	 * 
	 * @param o  an object to copy
	 */
	public Duplication(O o)
	{
		object = o;
	}
	
	
	@Override
	public O result()
	{
		return object.copy();
	}

	@Override
	public int cost()
	{
		return Integers.MAX_VALUE;
	}
}
