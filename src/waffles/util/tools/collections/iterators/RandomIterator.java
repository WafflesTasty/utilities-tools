package waffles.util.tools.collections.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import waffles.util.tools.Randomizer;

/**
 * The {@code RandomIterator} traverses a {@code List} through random shuffling.
 * The shuffling algorithm is handled by {@link Collections#shuffle(List, java.util.Random)}
 * by passing a {@code Randomizer} object to the iterator and using its generator.
 * 
 * @author Waffles
 * @since Nov 20, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  an object type
 * @see Iterator
 */
public class RandomIterator<O> implements Iterator<O>
{
	private Iterator<O> shuffle;
	
	/**
	 * Creates a new {@code RandomIterator}.
	 * This iterator uses {@link Randomizer#Global()}
	 * to shuffle the target list.
	 * 
	 * @param list  a target list
	 * 
	 * 
	 * @see List
	 */
	public RandomIterator(List<O> list)
	{
		this(list, Randomizer.Global());
	}
	
	/**
	 * Creates a new {@code RandomIterator}.
	 * 
	 * @param list  a target list
	 * @param rand  a target randomizer
	 * 
	 * 
	 * @see Randomizer
	 * @see List
	 */
	public RandomIterator(List<O> list, Randomizer rand)
	{
		List<O> copy = new ArrayList<>(list);
		Collections.shuffle(copy, rand.Generator());
		shuffle = copy.iterator();
	}
	
	
	@Override
	public boolean hasNext()
	{
		return shuffle.hasNext();
	}

	@Override
	public O next()
	{
		return shuffle.next();
	}
}