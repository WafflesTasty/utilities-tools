package waffles.utils.tools.patterns.properties.checks;

/**
 * The {@code Idleable} interface defines an object capable of idling.
 *
 * @author Waffles
 * @since 22 Sep 2024
 * @version 1.1
 */
@FunctionalInterface
public interface Idleable
{
	/**
	 * Checks if the {@code Idleable} is idle.
	 * 
	 * @return  {@code true} if idling
	 */
	public abstract boolean isIdle();
}