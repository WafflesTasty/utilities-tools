package waffles.util.tools.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import waffles.util.tools.Randomizer;
import waffles.util.tools.collections.iterators.ArrayIterator;
import waffles.util.tools.collections.iterators.CombineIterator;
import waffles.util.tools.collections.iterators.EmptyIterator;
import waffles.util.tools.collections.iterators.Interleaverator;
import waffles.util.tools.collections.iterators.RandomIterator;
import waffles.util.tools.collections.iterators.ReverseIterator;
import waffles.util.tools.collections.iterators.SingleIterator;

/**
 * The {@code Iterables} class provides static utility methods to generate {@code Iterable} objects.
 * 
 * @author Waffles
 * @since Aug 15, 2015
 * @version 1.0
 */
public final class Iterables
{			
	/**
	 * Returns a random iterable over a generic {@code List}.
	 * 
	 * @param <O>  an iterated object type
	 * @param objects  a list of objects
	 * @return  a random iterable
	 * 
	 * 
	 * @see Iterable
	 * @see List
	 */
	public static <O> Iterable<O> random(List<O> objects)
	{
		return () -> new RandomIterator<>(objects);
	}
	
	/**
	 * Returns a random iterable over a generic {@code List}.
	 * 
	 * @param <O>  an iterated object type
	 * @param objects  a list of objects
	 * @param rand  a random generator
	 * @return  a random iterable
	 * 
	 * 
	 * @see Iterable
	 * @see List
	 */
	public static <O> Iterable<O> random(List<O> objects, Randomizer rand)
	{
		return () -> new RandomIterator<>(objects, rand);
	}
	
	/**
	 * Returns a random iterable over a generic {@code Array}.
	 * 
	 * @param <O>  an iterated object type
	 * @param objects  a list of objects
	 * @param rand  a random generator
	 * @return  a random iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> random(O[] objects, Randomizer rand)
	{
		return random(Arrays.asList(objects), rand);
	}
	
	/**
	 * Returns a random iterable over a generic {@code Array}.
	 * 
	 * @param <O>  an iterated object type
	 * @param objects  a list of objects
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
	 * Returns an iterable over a generic {@code Array}.
	 * 
	 * @param <O>  an iterated object type
	 * @param array  an array of objects
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
	 * Returns an iterable composed of a set of {@code Iterables}.
	 * 
	 * @param <O>  an iterated object type
	 * @param iterables  a set of iterables
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
	 * Returns an iterable interleaving a set of {@code Iterables}.
	 * 
	 * @param <O>  an iterated object type
	 * @param iterables  a set of iterables
	 * @return  an interleaved iterable
	 * 
	 * 
	 * @see Iterable
	 */
	public static <O> Iterable<O> interleave(Iterable<O>... iterables)
	{
		return () -> new Interleaverator<>(iterables);
	}
	
	/**
	 * Returns a reverse iterable over a {@code Collection}.
	 * 
	 * @param <O>  an iterated object type
	 * @param objects  a collection of objects
	 * @return  a reverse iterable
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
	 * @param <O>  an iterated object type
	 * @param array  an array of objects
	 * @return  a reverse iterable
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
	 * @param <O>  an iterated object type
	 * @param array  an array of objects
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
	 * @param <O>  an iterated object type
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
	 * @param <O>  an iterated object type
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