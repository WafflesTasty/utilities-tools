package zeno.util.tools.generic.manipulators;

/**
 * The {@code Executable} interface represents an object that can be executed.
 * 
 * @since Oct 16, 2014
 * @author Zeno
 */
@FunctionalInterface
public interface Executable
{
	/**
	 * Executes the {@code Executable}.
	 */
	public abstract void execute();
}