package waffles.utils.tools.patterns.properties;

import java.util.Iterator;

/**
 * A {@code Queryable} defines an {@code Iterable} that defers iteration to a {@code Query}.
 * This allows {@code Query} hierarchies to be built as wrappers around search operations.
 * 
 * @author Waffles
 * @since 16 Feb 2026
 * @version 1.1
 *
 *
 * @param <O>  an object type
 * @see Iterable
 */
public interface Queryable<O> extends Iterable<O>
{
	/**
	 * A {@code Query} defines queries for a {@code Queryable}.
	 *
	 * @author Waffles
	 * @since 16 Feb 2026
	 * @version 1.1
	 *
	 *
	 * @param <O>  an object type
	 */
	public static interface Query<O>
	{
		/**
		 * Queries all objects in the {@code Queryable}.
		 * 
		 * @return  an object iterator
		 * 
		 * 
		 * @see Iterator
		 */
		public abstract Iterator<O> All();
	}

	
	@Override
	public default Iterator<O> iterator()
	{
		return Query().All();
	}
	
	/**
	 * Returns a {@code Query} object.
	 * 
	 * @return  a query
	 * 
	 * 
	 * @see Query
	 */
	public abstract Query<O> Query();
}
