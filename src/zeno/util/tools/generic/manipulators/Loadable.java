package zeno.util.tools.generic.manipulators;

/**
 * The {@code Loadable} interface defines an object capable of loading its state.
 * 
 * @since Oct 16, 2014
 * @author Zeno
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