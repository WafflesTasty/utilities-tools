package zeno.util.tools.helper;

import java.util.Collection;
import java.util.stream.Stream;

import zeno.util.tools.helper.iterables.StreamIterable;
import zeno.util.tools.helper.iterators.ArrayIterator;
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
	 * Returns an iterable over a generic {@code Array}.
	 * 
	 * @param <O>  a type of objects being iterated
	 * @param array  an array of objects to iterate
	 * @return  an array iterable
	 * 
	 * 
	 * @see Iterable
	 * @see Object
	 */
	public static <O> Iterable<O> of(Object[] array)
	{
		return () -> new ArrayIterator<>(array);
	}
	
	/**
	 * Returns an iterable over a generic {@code Stream}.
	 * </br> This iterable needs to be closed after use, i.e. with a try-with-resources.
	 * 
	 * @param <O>  a type of objects being iterated
	 * @param stream  a stream of objects to iterate
	 * @return  a stream iterable
	 * 
	 * 
	 * @see StreamIterable
	 * @see Stream
	 */
	public static <O> StreamIterable<O> of(Stream<O> stream)
	{
		return new StreamIterable<>(stream);
	}
	
	/**
	 * Returns a reverse iterable over a {@code Collection}.
	 * 
	 * @param <O>  a type of objects being iterated
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
	 * @param <O>  a type of objects being iterated
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
	 * Returns a singleton iterable over an {@code Object}.
	 * 
	 * @param <O>  a type of objects being iterated
	 * @param obj  an object to iterate
	 * @return  a singleton iterator
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> singleton(O obj)
	{
		return () -> new SingleIterator<>(obj);
	}
		
	/**
	 * Creates an iterable without any objects.
	 * 
	 * @param <O>  a type of objects being iterated
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