package zeno.util.tools.sorting;

import java.util.Arrays;

/**
 * The {@code ArraySort} class defines sorting methods for {@code Arrays}.
 *
 * @author Zeno
 * @since May 5, 2016
 */
public final class ArraySort
{
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
	
	
	private ArraySort()
	{
		// NOT APPLICABLE
	}
}