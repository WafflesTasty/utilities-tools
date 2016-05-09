package zeno.util.tools.generic.manipulators;

/**
 * The {@code Compilable} interface defines an object capable of being compiled.
 *
 * @author Zeno
 * @since Apr 10, 2015
 */
@FunctionalInterface
public interface Compilable
{
	/**
	 * Performs a compilation on the object.
	 * 
	 * @return  {@code true} if compilation was successful
	 */
	public abstract boolean compile();
}