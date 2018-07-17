package zeno.util.tools.patterns.manipulators;

/**
 * The {@code Correctable} interface defines an object that can be updated.
 *
 * @author Zeno
 * @since Jul 6, 2018
 * @version 1.0
 */
public interface Correctable
{
	/**
	 * Checks if a state update is needed in the {@code Correctable}.
	 * 
	 * @return  {@code true} if an update is needed
	 */
	public abstract boolean needsUpdate();	
	
	/**
	 * Requests a state update for the {@code Correctable}.
	 */
	public abstract void requestUpdate();
}