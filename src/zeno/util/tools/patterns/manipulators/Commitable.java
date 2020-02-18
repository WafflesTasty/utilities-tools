package zeno.util.tools.patterns.manipulators;

/**
 * The {@code Commitable} interface defines an object that can be committed.
 *
 * @author Zeno
 * @since 18 Feb 2020
 * @version 1.0
 */
public interface Commitable
{
	/**
	 * Commits the {@code Commitable}.
	 */
	public abstract void commit();
}