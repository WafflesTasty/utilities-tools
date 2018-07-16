package zeno.util.tools.patterns.functions;

import zeno.util.tools.patterns.Operation;
import zeno.util.tools.patterns.properties.Copyable;

/**
 * The {@code Repetition} class defines a duplication {@code Operation}.
 * The object stored in the operation is copied and returned.
 *
 * @author Zeno
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  the type of the result
 * @see Operation
 * @see Copyable
 */
public class Duplication<O extends Copyable<O>> implements Operation<O>
{
	private O object;
	
	/**
	 * Creates a new {@code Repetition}.
	 * 
	 * @param o  an object to return
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
		return 0;
	}
}
