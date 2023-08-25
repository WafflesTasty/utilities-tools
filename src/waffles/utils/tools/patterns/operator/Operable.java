package waffles.utils.tools.patterns.operator;

/**
 * The {@code Operable} interface defines an object that executes {@code Operations}.
 * As part of the {@link Operable}-{@link Operator} pattern, these objects do not define
 * their corresponding operations directly. Instead, each {@code Operable} comes with an
 * {@code Operator} object, which defines the operations and also serves as a dynamic
 * object type. The type of an {@code Operable} object can be checked through
 * the {@link #is(Operator)} method.
 *
 * @author Waffles
 * @since Jul 15, 2018
 * @version 1.1
 *
 *
 * @param <O>  an operable subtype
 */
public interface Operable<O extends Operable<O>>
{
	/**
	 * Checks if the {@code Operable} matches an {@code Operator} type.
	 * 
	 * @param type  an operator type
	 * @return  {@code true} if the type matches
	 * 
	 * 
	 * @see Operator
	 */
	public default boolean is(Operator<O> type)
	{
		return type.matches((O) this);
	}

	/**
	 * Returns the operator of the {@code Operable}.
	 * 
	 * @return  a target operator
	 * 
	 * 
	 * @see Operator
	 */
	public abstract Operator<O> Operator();
}