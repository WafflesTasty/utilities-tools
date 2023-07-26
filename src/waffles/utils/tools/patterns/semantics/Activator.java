package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Activator} interface defines an object that can be activated. 
 *
 * @author Waffles
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