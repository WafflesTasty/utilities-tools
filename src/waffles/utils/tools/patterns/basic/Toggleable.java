package waffles.utils.tools.patterns.basic;

/**
 * The {@code Toggleable} interface defines an object that can be toggled.
 *
 * @author Waffles
 * @since Jul 9, 2026
 * @version 1.1
 */
@FunctionalInterface
public interface Toggleable
{
	/**
	 * Toggles the {@code Toggleable}.
	 */
	public abstract void toggle();
}