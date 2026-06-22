package waffles.utils.tools.patterns.properties.counters;

import waffles.utils.tools.patterns.properties.Immutable;

/**
 * An {@code Indexed} object defines an index.
 *
 * @author Waffles
 * @since 09 Aug 2025
 * @version 1.1
 *
 * 
 * @param <N>  a value type
 * @see Immutable
 * @see Number
 */
@FunctionalInterface
public interface Indexed<N extends Number> extends Immutable
{
	/**
	 * An {@code Indexable.Mutable} can change its own index.
	 *
	 * @author Waffles
	 * @since 09 Aug 2025
	 * @version 1.1
	 *
	 * 
	 * @param <N>  a value type
	 * @see Immutable
	 * @see Indexed
	 * @see Number
	 */
	public static interface Mutable<N extends Number> extends Immutable.Mutable, Indexed<N>
	{
		/**
		 * Changes the index of the {@code Indexable}.
		 * 
		 * @param idx  an index
		 */
		public abstract void setIndex(N idx);
	}
	

	/**
	 * Returns an index {@code Number}.
	 * 
	 * @return  an index
	 */
	public abstract N Index();
}