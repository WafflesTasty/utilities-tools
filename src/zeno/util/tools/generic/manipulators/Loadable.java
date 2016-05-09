package zeno.util.tools.generic.manipulators;

/**
 * The {@code Loadable} interface defines an object capable of saving and loading its state.
 * 
 * @author Zeno
 * @since Oct 16, 2104
 */
public interface Loadable
{	
	/**
	 * Loads the state of the {@code Loadable}.
	 * 
	 * @return  {@code true} if successful
	 */
	public abstract boolean load();
	
	/**
	 * Saves the state of the {@code Loadable}.
	 * 
	 * @return  {@code true} if successful
	 */
	public abstract boolean save();
}