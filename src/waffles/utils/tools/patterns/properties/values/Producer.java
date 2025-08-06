package waffles.utils.tools.patterns.properties.values;

/**
 * A {@code Producer} is capable of producing an object.
 *
 * @author Waffles
 * @since 18 Mar 2024
 * @version 1.1
 * 
 * 
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Producer<O>
{
	/**
	 * Produces an object from the {@code Producer}.
	 * 
	 * @return  a new object
	 */
	public abstract O produce();
}