package zeno.util.tools.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import zeno.util.tools.helper.iterables.StreamIterable;
import zeno.util.tools.helper.iterators.ArrayIterator;
import zeno.util.tools.helper.iterators.CombineIterator;
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
	 * Returns a random iterable over a generic {@code Array}.
	 * 
	 * @param <O>  an object type
	 * @param objects  an object list
	 * @return  a random iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> random(O[] objects)
	{
		return random(Arrays.asList(objects));
	}
	
	/**
	 * Returns a random iterable over a generic {@code List}.
	 * 
	 * @param <O>  an object type
	 * @param objects  an object list
	 * @return  a random iterable
	 * 
	 * 
	 * @see Iterable
	 * @see List
	 */
	public static <O> Iterable<O> random(List<O> objects)
	{
		List<O> list = new ArrayList<>(objects);
		
		return () ->
		{
			Collections.shuffle(list);
			return list.iterator();
		};
	}
	
	
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
	 * Returns an iterable over a set of {@code Iterables}.
	 * 
	 * @param <O>  a type of objects being iterated
	 * @param iterables  a set of iterables to iterate
	 * @return  a composite iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> compose(Iterable<O>... iterables)
	{
		return () -> new CombineIterator<>(iterables);
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
	 * Returns a null-check iterable over a generic {@code Array}.
	 * 
	 * @param <O>  an object type
	 * @param array  an array to iterate
	 * @return  a null-check iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> sansNulls(O[] array)
	{
		return () -> new ArrayIterator<>(array, true);
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