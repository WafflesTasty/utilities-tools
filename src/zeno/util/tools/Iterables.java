package zeno.util.tools;

import java.util.Collection;

import zeno.util.tools.iterators.EmptyIterator;
import zeno.util.tools.iterators.ReverseIterator;

/**
 * The {@code Iterables} class provides a few basic iterables.
 *
 * @author Zeno
 * @since Aug 15, 2015
 */
public final class Iterables
{	
	/**
	 * Returns a reverse iterable over a {@code Collection}.
	 * 
	 * @param objects  a collection of objects to iterate
	 * @return a reverse iterable
	 * @see Collection
	 * @see Iterable
	 */
	public static <O> Iterable<O> reverseOf(Collection<O> objects)
	{
		return () -> new ReverseIterator<>(objects);
	}
	
	/**
	 * Returns a reverse iterable over an {@code Array}.
	 * 
	 * @param array  an array of objects to iterate
	 * @return a reverse iterable
	 * @see Iterable
	 */
	public static <O> Iterable<O> reverseOf(O[] array)
	{		
		return () -> new ReverseIterator<>(array);
	}
		
	/**
	 * Creates an iterable without any objects.
	 * 
	 * @return  an empty iterable
	 * @see Iterable
	 */
	public static <O> Iterable<O> empty()
	{
		return () -> new EmptyIterator<>();
	}
	
	private Iterables()
	{
		// NOT APPLICABLE
	}
}