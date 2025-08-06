package waffles.utils.tools.patterns.properties.values;

/**
 * The {@code Valuable} interface defines an object with a value.
 *
 * @author Waffles
 * @since 01 Aug 2020
 * @version 1.1
 * 
 * 
 * @param <V>  a value type
 */
@FunctionalInterface
public interface Valuable<V>
{
	/**
	 * Returns the value of the {@code Valuable}.
	 * 
	 * @return  an object value
	 */
	public abstract V Value();
}