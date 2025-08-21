package waffles.utils.tools.patterns.operator;

/**
 * The {@code Operator} interface implements {@code Operations} for {@code Operable} objects.
 * As part of the {@link Operable}-{@link Operator} pattern, each {@code Operator} interface
 * defines a subtype that applies specific optimizations to its operations. An implementation
 * of this pattern can be found in the {@code Algebra} utility library, where it is used
 * to optimize various matrix operations.
 *
 * @author Waffles
 * @since Jul 15, 2018
 * @version 1.1
 * 
 *
 * @param <O>  an operable subtype
 * @see Operable
 */
@FunctionalInterface
public interface Operator<O extends Operable<O>>
{	
	/**
	 * Returns the abstract type of the {@code Operator}.
	 * </br> The result of this method can be passed to an
	 * {@code Operable} object to verify compatibility.
	 * 
	 * @return  a type operator
	 * 
	 * 
	 * @see Operable
	 */
	public static <O extends Operable<O>> Operator<O> Type()
	{
		return () -> null;
	}
	
	
	/**
	 * Checks if an {@code Operator} matches this {@code Operator}.
	 * This method returns {@code true} if the provided
	 * operator is a subtype of this operator.
	 * 
	 * @param obj  an operable to compare
	 * @return  {@code true} if the operable matches
	 */
	public default boolean matches(O obj)
	{
		return obj.Operator() instanceof Operator;
	}

	/**
	 * Returns a new instance of this {@code Operator}.
	 * 
	 * @param obj  an operable to instance
	 * @return  a new operator instance
	 */
	public default Operator<O> instance(O obj)
	{
		return () -> obj;
	}
	
	/**
	 * Returns the {@code Operator} target.
	 * 
	 * @return  a target operable
	 * 
	 * 
	 * @see Operable
	 */
	public abstract O Operable();
}