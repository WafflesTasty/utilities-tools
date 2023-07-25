package waffles.util.tools.patterns.semantics;

/**
 * The {@code Permissible} interface defines an object that can deny permission.
 *
 * @author Waffles
 * @since Oct 04, 2019
 * @version 1.0
 */
@FunctionalInterface
public interface Permissible
{
	/**
	 * Checks the state of the {@code Permissible}.
	 * 
	 * @return  {@code true} if the permissible is enabled
	 */
	public abstract boolean isEnabled();
}