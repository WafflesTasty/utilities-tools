package zeno.util.tools.patterns;

/**
 * The {@code Operable} interface defines an object that can be operated.
 * An object can implement this interface to mimick multiple inheritance.
 * Implementations of methods are left to the {@code Operator} object.
 *
 * @author Zeno
 * @since Jul 15, 2018
 * @version 1.0
 *
 * @param <O>  the type of the operable
 * @see Operation
 * @see Operator
 */
public interface Operable<O extends Operable<O>>
{	
	/**
	 * Checks if the {@code Operable} matches an {@code Operator}.
	 * This method returns {@code true} if the operator is
	 * a valid type for this {@code Operable}.
	 * 
	 * @param type  an operator type
	 * @param ulps  an approximate error margin
	 * @return  {@code true} if the operator matches
	 * @see Operator
	 */
	public default boolean is(Operator<O> type, int ulps)
	{
		if(!type.matches(Operator()))
		{
			return type.matches((O) this, ulps);
		}
		
		return true;
	}
	
	/**
	 * Checks if the {@code Operable} matches an {@code Operator}.
	 * This method returns {@code true} if the operator is
	 * a valid type for this {@code Operable}.
	 * 
	 * @param type  an operator type
	 * @return  {@code true} if the operator matches
	 * @see Operator
	 */
	public default boolean is(Operator<O> type)
	{
		return is(type, 0);
	}

	/**
	 * Returns the operator of the {@code Operable}.
	 * 
	 * @return  a target operator
	 * @see Operator
	 */
	public abstract Operator<O> Operator();
}