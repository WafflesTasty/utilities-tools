package waffles.utils.tools.patterns.properties.counters;

/**
 * A {@code Handler} defines an object with a pointer.
 * This pointer is usually a long value which
 * references a memory address.
 *
 * @author Waffles
 * @since 17 Jul 2020
 * @version 1.1
 */
@FunctionalInterface
public interface Handler
{
	/**
	 * Returns a pointer for the {@code Handler}.
	 * 
	 * @return  a long pointer
	 */
	public abstract long Handle();
}