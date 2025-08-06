package waffles.utils.tools.patterns.basic;

/**
 * The {@code Executable} interface defines an object that executes commands.
 * 
 * @author Waffles
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