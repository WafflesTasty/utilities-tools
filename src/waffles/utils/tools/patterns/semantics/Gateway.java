package waffles.utils.tools.patterns.semantics;

/**
 * A {@code Gateway} decides whether objects of a type are allowed somewhere.
 *
 * @author Waffles
 * @since 13 Dec 2023
 * @version 1.1
 *
 *
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Gateway<O>
{
	/**
	 * Checks if an object is allowed in the {@code Gateway}.
	 * 
	 * @param obj  a target object
	 * @return  {@code true} if the object is allowed
	 */
	public abstract boolean allows(O obj);
}