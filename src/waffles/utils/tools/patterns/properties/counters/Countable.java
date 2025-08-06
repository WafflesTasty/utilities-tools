package waffles.utils.tools.patterns.properties.counters;

/**
 * A {@code Countable} object can be counted.
 *
 * @author Waffles
 * @since 09 Jun 2025
 * @version 1.1
 */
@FunctionalInterface
public interface Countable
{
	/**
	 * Returns the count of the {@code Countable}.
	 * 
	 * @return  an item count
	 */
	public abstract int Count();
}