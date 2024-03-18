package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Resettable} interface defines an object that can be reset.
 *
 * @author Waffles
 * @since 19 Feb 2020
 * @version 1.0
 */
@FunctionalInterface
public interface Resettable
{
	/**
	 * Resets the state of the {@code Resettable}.
	 */
	public abstract void reset();
}