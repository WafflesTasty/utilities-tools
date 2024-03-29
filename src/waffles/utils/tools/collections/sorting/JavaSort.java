package waffles.utils.tools.collections.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The {@code JavaSort} class defines a wrapper for Java's default sorting method.
 * 
 * <ul>
 * 	<li> This algorithm has a worst-case complexity of O(n log n).
 * 	<li> This algorithm has an average complexity of O(n log n).
 * 	<li> This algorithm has a best-case complexity of O(n).
 * </ul>
 * 
 * @author Waffles
 * @since Mar 26, 2017
 * @version 1.0
 * 
 *
 * @param <O>  a list object type
 * @see AbstractSort
 */
public class JavaSort<O> extends AbstractSort<O>
{
	/**
	 * Creates a new {@code JavaSort}.
	 * </br> Without a comparator, this
	 * sort depends on natural ordering.
	 */
	public JavaSort()
	{
		super();
	}
	
	/**
	 * Creates a new {@code JavaSort}.
	 * 
	 * @param c  a comparator to use
	 * 
	 * 
	 * @see Comparator
	 */
	public JavaSort(Comparator<O> c)
	{
		super(c);
	}
	
		
	@Override
	public void sort(O[] list, int start, int end)
	{
		Arrays.sort(list, start, end, this);
	}

	@Override
	public void sort(List<O> list, int start, int end)
	{
		Collections.sort(list.subList(start, end), this);
	}
}