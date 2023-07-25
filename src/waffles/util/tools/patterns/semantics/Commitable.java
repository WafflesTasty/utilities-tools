package waffles.util.tools.patterns.semantics;

/**
 * The {@code Commitable} interface defines an object that manually commits updates.
 *
 * @author Waffles
 * @since 18 Feb 2020
 * @version 1.1
 */
@FunctionalInterface
public interface Commitable
{
	/**
	 * Commits updates with the {@code Commitable}.
	 */
	public abstract void commit();
}