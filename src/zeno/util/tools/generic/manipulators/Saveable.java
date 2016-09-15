package zeno.util.tools.generic.manipulators;

/**
 * The {@code Saveable} interface defines an object capable of saving its state.
 * 
 * @since Oct 16, 2014
 * @author Zeno
 */
@FunctionalInterface
public interface Saveable
{		
	/**
	 * Saves the state of the {@code Saveable}.
	 * 
	 * @return  {@code true} if successful
	 */
	public abstract boolean save();
}