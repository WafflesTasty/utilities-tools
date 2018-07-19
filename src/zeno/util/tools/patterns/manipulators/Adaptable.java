package zeno.util.tools.patterns.manipulators;

/**
 * The {@code Adaptable} interface defines an object that can be updated.
 *
 * @author Zeno
 * @since Jul 6, 2018
 * @version 1.0
 */
public interface Adaptable
{
	/**
	 * Checks if a state update is needed in the {@code Adaptable}.
	 * 
	 * @return  {@code true} if an update is needed
	 */
	public abstract boolean needsUpdate();	
	
	/**
	 * Requests a state update for the {@code Adaptable}.
	 */
	public abstract void requestUpdate();
}