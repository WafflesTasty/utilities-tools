package zeno.util.too.patterns.manipulators;

/**
 * The {@code Saveable} interface defines an object capable of saving its state.
 * 
 * @author Zeno
 * @since Oct 16, 2014
 * @version 1.0
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