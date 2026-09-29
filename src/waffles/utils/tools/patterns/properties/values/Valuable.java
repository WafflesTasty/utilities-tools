package waffles.utils.tools.patterns.properties.values;

import waffles.utils.tools.patterns.properties.Immutable;

/**
 * A {@code Valuable} is an object with a value.
 *
 * @author Waffles
 * @since 01 Aug 2020
 * @version 1.1
 * 
 * 
 * @param <V>  a value type
 * @see Immutable
 */
@FunctionalInterface
public interface Valuable<V> extends Immutable
{
	/**
	 * A {@code Valuable.Mutable} can change its own value.
	 *
	 * @author Waffles
	 * @since Sep 26, 2026
	 * @version 1.1
	 *
	 *
	 * @param <V>  a value type
	 * @see Immutable
	 */
	public static interface Mutable<V> extends Valuable<V>, Immutable.Mutable
	{
		/**
		 * Changes the {@code Valuable} value.
		 * 
		 * @param val  a value
		 */
		public abstract void setValue(V val);
	}
	
	/**
	 * Returns the {@code Valuable} value.
	 * 
	 * @return  a value
	 */
	public abstract V Value();
}