package waffles.utils.tools.patterns.basic;

/**
 * The {@code Clearable} interface defines an object that can clear its contents.
 *
 * @author Waffles
 * @since 18 Feb 2020
 * @version 1.1
 */
@FunctionalInterface
public interface Clearable
{
	/**
	 * Clears the contents of the {@code Clearable}.
	 */
	public abstract void clear();
}