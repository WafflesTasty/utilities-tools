package zeno.util.tools.patterns.properties.operable;

import zeno.util.tools.patterns.properties.Operable;

/**
 * The {@code Operator} interface implements {@code Operations} for objects.
 * Every operator is linked to an {@code Operable} object for which
 * the operations are implemented.
 *
 * @author Zeno
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  the type of the operable
 * @see Operation
 * @see Operable
 */
public interface Operator<O extends Operable<O>>
{	
	/**
	 * Returns the abstract type of the {@code Operator}.
	 * 
	 * @return  a type operator
	 * 
	 * 
	 * @see Operable
	 */
	public static <O extends Operable<O>> Operator<O> Type()
	{
		return () ->
		{
			return null;
		};
	}
	
	
	/**
	 * Checks if an operator matches this {@code Operator}.
	 * This method returns {@code true} if the provided
	 * operator is a subtype of this operator.
	 * 
	 * @param operator  an operator to check
	 * @return  {@code true} if the operator matches
	 */
	public default boolean matches(Operator<O> operator)
	{
		return true;
	}

	/**
	 * Checks if an object matches this {@code Operator}.
	 * This method returns {@code true} if the provided
	 * object is a subtype of this operator.
	 * 
	 * @param object  an object to check
	 * @param ulps  an approximate error margin
	 * @return  {@code true} if the tensor matches
	 */
	public default boolean matches(O object, int ulps)
	{
		return true;
	}
	
	/**
	 * Returns an instance of the {@code Operator}.
	 * 
	 * @param object  a target operable
	 * @return  an operator instance
	 */
	public default Operator<O> instance(O object)
	{
		return () ->
		{
			return object;
		};
	}
	
	
	/**
	 * Returns the {@code Operator} target.
	 * 
	 * @return  the target operable
	 * @see Operable
	 */
	public abstract O Operable();
}