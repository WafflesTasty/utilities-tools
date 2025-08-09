package waffles.utils.tools.patterns.properties.counters;

import waffles.utils.tools.patterns.properties.Immutable;

/**
 * An {@code Indexable} object defines a long index.
 *
 * @author Waffles
 * @since 09 Aug 2025
 * @version 1.1
 *
 * 
 * @see Immutable
 */
@FunctionalInterface
public interface Indexable extends Immutable
{
	/**
	 * An {@code Indexable.Mutable} can change its own index.
	 *
	 * @author Waffles
	 * @since 09 Aug 2025
	 * @version 1.1
	 *
	 * 
	 * @see Immutable
	 * @see Indexable
	 */
	public static interface Mutable extends Immutable.Mutable, Indexable
	{
		/**
		 * Changes the index of the {@code Indexable}.
		 * 
		 * @param idx  a long index
		 */
		public abstract void setIndex(long idx);
	}
	
	/**
	 * A {@code Base} implements a basic {@code Indexable.Mutable}.
	 *
	 * @author Waffles
	 * @since 09 Aug 2025
	 * @version 1.1
	 *
	 * 
	 * @see Indexable.Mutable
	 */
	public static class Base implements Mutable
	{
		private long index;

		@Override
		public void setIndex(long idx)
		{
			index = idx;
		}
		
		@Override
		public long Index()
		{
			return index;
		}
	}
	
	
	/**
	 * Returns the index of the {@code Indexable}.
	 * 
	 * @return  a long index
	 */
	public abstract long Index();
}