package zeno.util.tools.patterns.properties;

/**
 * The {@code Permissible} interface defines an object that can be enabled.
 *
 * @author Zeno
 * @since Oct 04, 2019
 * @version 1.0
 */
@FunctionalInterface
public interface Permissible
{
	/**
	 * Checks the state of the {@code Permissible}.
	 * 
	 * @return  {@code true} if the object is permitted
	 */
	public abstract boolean isEnabled();
}