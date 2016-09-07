package zeno.util.tools.generic.manipulators;

/**
 * The {@code Action} interface represents an object that can be executed.
 * 
 * @since Oct 16, 2014
 * @author Zeno
 */
@FunctionalInterface
public interface Action
{
	/**
	 * Executes the {@code Action}.
	 */
	public abstract void execute();
}