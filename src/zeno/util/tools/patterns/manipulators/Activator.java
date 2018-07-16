package zeno.util.tools.patterns.manipulators;

/**
 * The {@code Activator} interface represents an object that can be activated. 
 *
 * @author Zeno
 * @since Jul 3, 2015
 * @version 1.0
 */
public interface Activator
{
	/**
	 * Activates the {@code Activator}.
	 */
	public abstract void activate();
	
	/**
	 * Deactivates the {@code Activator}.
	 */
	public abstract void deactivate();
}