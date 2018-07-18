package zeno.util.too.patterns.manipulators;

/**
 * The {@code Disposable} interface defines an object capable of being disposed.
 *
 * @author Zeno
 * @since Apr 10, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Disposable
{
	/**
	 * Disposes the object.
	 */
	public abstract void dispose();
}