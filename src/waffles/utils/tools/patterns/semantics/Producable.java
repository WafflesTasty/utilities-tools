package waffles.utils.tools.patterns.semantics;

/**
 * A {@code Producable} is capable of producing an object.
 *
 * @author Waffles
 * @since 18 Mar 2024
 * @version 1.1
 * 
 * 
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Producable<O>
{
	/**
	 * Produces an object from the {@code Producable}.
	 * 
	 * @return  a new object
	 */
	public abstract O produce();
}