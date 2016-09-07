package zeno.util.tools;

import java.util.Arrays;

/**
 * The {@code ArraySort} class defines sorting methods for {@code Arrays}.
 *
 * @author Zeno
 * @since May 5, 2016
 */
public final class ArrayUtil
{
	/**
	 * Returns a primitive of a wrapper {@code Array}.
	 * 
	 * @param array  a wrapper array
	 * @return  a primitive array
	 * @see Character
	 */
	public static char[] cast(Character... array)
	{
		char[] copy = new char[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a primitive of a wrapper {@code Array}.
	 * 
	 * @param array  a wrapper array
	 * @return  a primitive array
	 * @see Double
	 */
	public static double[] cast(Double... array)
	{
		double[] copy = new double[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
		
	/**
	 * Returns a primitive of a wrapper {@code Array}.
	 * 
	 * @param array  a wrapper array
	 * @return  a primitive array
	 * @see Integer
	 */
	public static int[] cast(Integer... array)
	{
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a primitive of a wrapper {@code Array}.
	 * 
	 * @param array  a wrapper array
	 * @return  a primitive array
	 * @see Float
	 */
	public static float[] cast(Float... array)
	{
		float[] copy = new float[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a primitive of a wrapper {@code Array}.
	 * 
	 * @param array  a wrapper array
	 * @return  a primitive array
	 * @see Long
	 */
	public static long[] cast(Long... array)
	{
		long[] copy = new long[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	
	/**
	 * Returns a wrapper of a primitive {@code Array}.
	 * 
	 * @param array  a primitive array
	 * @return  a wrapper array
	 * @see Character
	 */
	public static Character[] cast(char... array)
	{
		Character[] copy = new Character[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a wrapper of a primitive {@code Array}.
	 * 
	 * @param array  a primitive array
	 * @return  a wrapper array
	 * @see Double
	 */
	public static Double[] cast(double... array)
	{
		Double[] copy = new Double[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a wrapper of a primitive {@code Array}.
	 * 
	 * @param array  a primitive array
	 * @return  a wrapper array
	 * @see Integer
	 */
	public static Integer[] cast(int... array)
	{
		Integer[] copy = new Integer[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
		
	/**
	 * Returns a wrapper of a primitive {@code Array}.
	 * 
	 * @param array  a primitive array
	 * @return  a wrapper array
	 * @see Float
	 */
	public static Float[] cast(float... array)
	{
		Float[] copy = new Float[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	/**
	 * Returns a wrapper of a primitive {@code Array}.
	 * 
	 * @param array  a primitive array
	 * @return  a wrapper array
	 * @see Long
	 */
	public static Long[] cast(long... array)
	{
		Long[] copy = new Long[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static int[] reverse(int[] array)
	{
		int len = array.length;
		
		int[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
		
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static long[] reverse(long[] array)
	{
		int len = array.length;
		
		long[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
	
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static float[] reverse(float[] array)
	{
		int len = array.length;
		
		float[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
	
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static double[] reverse(double[] array)
	{
		int len = array.length;
		
		double[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
		
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static char[] reverse(char[] array)
	{
		int len = array.length;
		
		char[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
	
	/**
	 * Returns a copy of an {@code Array} in reverse.
	 * 
	 * @param array  an array to reverse
	 * @return  the reverse array
	 */
	public static <O> O[] reverse(O[] array)
	{
		int len = array.length;
		
		O[] copy = Arrays.copyOf(array, len);
		for(int i = 0; i < len; i++)
		{
			copy[i] = array[len - i - 1];
		}
		
		return copy;
	}
	
	
	private ArrayUtil()
	{
		// NOT APPLICABLE
	}
}