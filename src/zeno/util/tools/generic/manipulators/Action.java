package zeno.util.tools.generic.manipulators;

/**
 * The {@code Action} interface represents an object that can be executed.
 * 
 * @author Zeno
 * @since Oct 16, 2104
 */
@FunctionalInterface
public interface Action
{
	/**
	 * Executes the {@code Action}.
	 */
	public abstract void execute();
}