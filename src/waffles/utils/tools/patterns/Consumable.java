package waffles.utils.tools.patterns;

/**
 * The {@code Consumable} interface defines an object which consumes objects.
 *
 * @author Waffles
 * @since 11 Sep 2023
 * @version 1.1
 *
 *
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Consumable<O>
{
	/**
	 * Attempts to consume an object.
	 * 
	 * @param obj  a target object
	 * @return  {@code true} if the object was consumed
	 */
	public abstract boolean consume(O obj);
}