package zeno.util.tools.patterns.properties;

/**
 * The {@code Updateable} interface defines an object that can be updated.
 *
 * @author Zeno
 * @since Jul 6, 2018
 * @version 1.0
 */
public interface Updateable
{
	/**
	 * Checks if a state update is needed in the {@code Updateable}.
	 * 
	 * @return  {@code true} if an update is needed
	 */
	public abstract boolean needsUpdate();	
	
	/**
	 * Requests a state update for the {@code Updateable}.
	 */
	public abstract void requestUpdate();
}