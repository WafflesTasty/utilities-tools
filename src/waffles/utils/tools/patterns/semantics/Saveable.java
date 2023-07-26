package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Saveable} interface defines an object that can save and load its state.
 * 
 * @author Waffles
 * @since Oct 16, 2014
 * @version 1.0
 */
public interface Saveable extends Loadable
{		
	/**
	 * Saves the state of the {@code Saveable}.
	 * 
	 * @return  {@code true} if successful
	 */
	public abstract boolean save();
}