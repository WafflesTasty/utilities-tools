package waffles.utils.tools.collections.iterators;

import java.util.Iterator;

/**
 * A {@code PrevIterator} is an {@code Iterator} that can return to a previous element. 
 *
 * @author Waffles
 * @since May 28, 2026
 * @version 1.1
 *
 *
 * @param <O>  an object type
 * @see Iterator
 */
public interface PrevIterator<O> extends Iterator<O>
{
	/**
	 * Returns the previous element in the iteration.
	 * 
	 * @return  the previous element in the iteration
	 */
	public abstract O prev();
}