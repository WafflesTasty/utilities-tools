package zeno.util.too.patterns.manipulators;

/**
 * The {@code Loadable} interface defines an object capable of loading its state.
 * 
 * @author Zeno
 * @since Oct 16, 2014
 * @version 1.0
 */
@FunctionalInterface
public interface Loadable
{	
	/**
	 * Loads the state of the {@code Loadable}.
	 * 
	 * @return  {@code true} if successful
	 */
	public abstract boolean load();
}