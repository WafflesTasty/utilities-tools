package zeno.util.tools.helper;

import java.util.Collection;

import zeno.util.tools.helper.iterators.EmptyIterator;
import zeno.util.tools.helper.iterators.ReverseIterator;
import zeno.util.tools.helper.iterators.SingleIterator;

/**
 * The {@code Iterables} class provides a few basic iterables.
 * 
 * @author Zeno
 * @since Aug 15, 2015
 * @version 1.0
 */
public final class Iterables
{	
	/**
	 * Returns a reverse iterable over a {@code Collection}.
	 * 
	 * @param objects  a collection of objects to iterate
	 * @return a reverse iterable
	 * 
	 * 
	 * @see Collection
	 * @see Iterable
	 */
	public static <O> Iterable<O> reverseOf(Collection<O> objects)
	{
		return () -> new ReverseIterator<>(objects);
	}
	
	/**
	 * Returns a reverse iterable over a generic {@code Array}.
	 * 
	 * @param array  an array of objects to iterate
	 * @return a reverse iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> reverseOf(O[] array)
	{		
		return () -> new ReverseIterator<>(array);
	}
		
	/**
	 * Returns a singleton iterabl over an {@code Object}.
	 * 
	 * @param obj  an object to iterate
	 * @return  a singleton iterator
	 * @see Iterable
	 */
	public static <O> Iterable<O> singleton(O obj)
	{
		return () -> new SingleIterator<>(obj);
	}
	
	/**
	 * Creates an iterable without any objects.
	 * 
	 * @return  an empty iterable
	 * 
	 * 
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