package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Disposable} interface defines an object that can be manually disposed.
 *
 * @author Waffles
 * @since Apr 10, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Disposable
{
	/**
	 * Disposes the {@code Disposable}.
	 */
	public abstract void dispose();
}