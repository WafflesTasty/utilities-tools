package waffles.utils.tools.patterns.properties.checks;

import waffles.utils.tools.patterns.properties.Immutable;

/**
 * A {@code Visibility} object defines a visibility state.
 *
 * @author Waffles
 * @since Jul 5, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Visibility extends Immutable
{
	/**
	 * A {@code Visibility.Mutable} can changes its own visibility state.
	 *
	 * @author Waffles
	 * @since May 13, 2026
	 * @version 1.1
	 *
	 * 
	 * @see Immutable
	 * @see Visibility
	 */
	public static interface Mutable extends Immutable.Mutable, Visibility
	{
		/**
		 * Changes the visibility of the object.
		 * 
		 * @param v  a visibility state
		 */
		public abstract void setVisible(boolean v);
	}
	
	
	/**
	 * Returns the visibility of the object.
	 * 
	 * @return  a visibility state
	 */
	public abstract boolean isVisible();
}