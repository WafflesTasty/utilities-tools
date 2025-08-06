package waffles.utils.tools.patterns.basic;

/**
 * The {@code Loadable} interface defines an object that can load state.
 * 
 * @author Waffles
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