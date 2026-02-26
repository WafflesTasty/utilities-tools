package waffles.utils.tools.patterns.properties.checks;

import waffles.utils.tools.patterns.properties.Immutable;

/**
 * The {@code Idleable} interface defines an object capable of idling.
 *
 * @author Waffles
 * @since 22 Sep 2024
 * @version 1.1
 * 
 * 
 * @see Immutable
 */
@FunctionalInterface
public interface Idleable extends Immutable
{
	/**
	 * An {@code Idleable.Mutable} can change its own idle state.
	 *
	 * @author Waffles
	 * @since 26 Feb 2026
	 * @version 1.1
	 *
	 * 
	 * @see Immutable
	 * @see Idleable
	 */
	public static interface Mutable extends Idleable, Immutable.Mutable
	{
		/**
		 * Changes the idle state of the {@code Idleable}.
		 * 
		 * @param isIdle  an idle state
		 */
		public abstract void setIdle(boolean isIdle);
	}
	
	
	/**
	 * Checks if the {@code Idleable} is idle.
	 * 
	 * @return  {@code true} if idling
	 */
	public abstract boolean isIdle();
}