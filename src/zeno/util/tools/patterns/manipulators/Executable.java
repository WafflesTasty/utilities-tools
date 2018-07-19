package zeno.util.tools.patterns.manipulators;

/**
 * The {@code Executable} interface represents an object that can be executed.
 * 
 * @author Zeno
 * @since Oct 16, 2014
 * @version 1.0
 */
@FunctionalInterface
public interface Executable
{
	/**
	 * Executes the {@code Executable}.
	 */
	public abstract void execute();
}