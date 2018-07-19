package zeno.util.tools.primitives;

import java.util.Comparator;

import zeno.util.tools.Doubles;
import zeno.util.tools.Floats;
import zeno.util.tools.Integers;
import zeno.util.tools.Longs;

/**
 * The {@code AbsComparator} defines comparators based on the absolute value of numbers.
 *
 * @author Zeno
 * @since Jul 11, 2018
 * @version 1.0
 */
public class AbsComparator
{
	/**
	 * Returns an absolute double {@code Comparator}.
	 * 
	 * @return  an absolute comparator
	 * 
	 * 
	 * @see Comparator
	 * @see Double
	 */
	public static Comparator<Double> Doubles()
	{
		return new Comparator<Double>()
		{
			@Override
			public int compare(Double v1, Double v2)
			{
				return (int) Doubles.sign(Doubles.abs(v1) - Doubles.abs(v2));
			}
		};
	}
	
	/**
	 * Returns an absolute float {@code Comparator}.
	 * 
	 * @return  an absolute comparator
	 * 
	 * 
	 * @see Comparator
	 * @see Float
	 */
	public static Comparator<Float> Floats()
	{
		return new Comparator<Float>()
		{
			@Override
			public int compare(Float v1, Float v2)
			{
				return (int) Floats.sign(Floats.abs(v1) - Floats.abs(v2));
			}
		};
	}
	
	/**
	 * Returns an absolute integer {@code Comparator}.
	 * 
	 * @return  an absolute comparator
	 * 
	 * 
	 * @see Comparator
	 * @see Integer
	 */
	public static Comparator<Integer> Integers()
	{
		return new Comparator<Integer>()
		{
			@Override
			public int compare(Integer v1, Integer v2)
			{
				return Integers.sign(Integers.abs(v1) - Integers.abs(v2));
			}
		};
	}
	
	/**
	 * Returns an absolute long {@code Comparator}.
	 * 
	 * @return  an absolute comparator
	 * 
	 * 
	 * @see Comparator
	 * @see Long
	 */
	public static Comparator<Long> Longs()
	{
		return new Comparator<Long>()
		{
			@Override
			public int compare(Long v1, Long v2)
			{
				return (int) Longs.sign(Longs.abs(v1) - Longs.abs(v2));
			}
		};
	}
	
	
	private AbsComparator()
	{
		// NOT APPLICABLE
	}
}