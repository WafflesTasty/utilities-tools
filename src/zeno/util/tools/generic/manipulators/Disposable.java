package zeno.util.tools.generic.manipulators;

/**
 * The {@code Disposable} interface defines an object capable of being disposed.
 *
 * @since Apr 10, 2015
 * @author Zeno
 */
@FunctionalInterface
public interface Disposable
{
	/**
	 * Disposes the object.
	 */
	public abstract void dispose();
}