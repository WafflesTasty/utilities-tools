package waffles.utils.tools.primitives;

import java.util.Arrays;

/**
 * The {@code Array} class defines utility methods for {@code Arrays}.
 *
 * @author Waffles
 * @since May 5, 2016
 * @version 1.1
 */
public final class Array
{	
	/**
	 * The {@code contents} operation checks array containment.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class contents
	{
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(double[] array, double val)
		{
			for(double v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(float[] array, float val)
		{
			for(float v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(short[] array, short val)
		{
			for(short v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(long[] array, long val)
		{
			for(long v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(char[] array, char val)
		{
			for(char v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Returns a contents check of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @param val  a value to find
		 * @return  {@code true} if the array contains the value
		 */
		public static boolean has(int[] array, int val)
		{
			for(int v : array)
			{
				if(val == v)
				{
					return true;
				}
			}
			
			return false;
		}

		
		private contents()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code maximum} operation computes an array maximum.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class maximum
	{
		/**
		 * Returns the maximum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array maximum
		 */
		public static double of(double... array)
		{
			double max = Doubles.MIN_VALUE;
			for(double val : array)
			{
				if(max < val)
				{
					max = val;
				}
			}
			
			return max;
		}
		
		/**
		 * Returns the maximum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array maximum
		 */
		public static float of(float... array)
		{
			float max = Floats.MIN_VALUE;
			for(float val : array)
			{
				if(max < val)
				{
					max = val;
				}
			}
			
			return max;
		}
		
		/**
		 * Returns the maximum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array maximum
		 */
		public static short of(short... array)
		{
			short max = Shorts.MIN_VALUE;
			for(short val : array)
			{
				if(max < val)
				{
					max = val;
				}
			}
			
			return max;
		}
		
		/**
		 * Returns the maximum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array maximum
		 */
		public static long of(long... array)
		{
			long max = Longs.MIN_VALUE;
			for(long val : array)
			{
				if(max < val)
				{
					max = val;
				}
			}
			
			return max;
		}
		
		/**
		 * Returns the maximum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array maximum
		 */
		public static int of(int... array)
		{
			int max = Integers.MIN_VALUE;
			for(int val : array)
			{
				if(max < val)
				{
					max = val;
				}
			}
			
			return max;
		}

		
		private maximum()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code minimum} operation computes an array minimum.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class minimum
	{
		/**
		 * Returns the minimum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array minimum
		 */
		public static double of(double... array)
		{
			double min = Doubles.MAX_VALUE;
			for(double val : array)
			{
				if(min > val)
				{
					min = val;
				}
			}
			
			return min;
		}
		
		/**
		 * Returns the minimum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array minimum
		 */
		public static float of(float... array)
		{
			float min = Floats.MAX_VALUE;
			for(float val : array)
			{
				if(min > val)
				{
					min = val;
				}
			}
			
			return min;
		}
		
		/**
		 * Returns the minimum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array minimum
		 */
		public static short of(short... array)
		{
			short min = Shorts.MAX_VALUE;
			for(short val : array)
			{
				if(min > val)
				{
					min = val;
				}
			}
			
			return min;
		}
		
		/**
		 * Returns the minimum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array minimum
		 */
		public static long of(long... array)
		{
			long min = Longs.MAX_VALUE;
			for(long val : array)
			{
				if(min > val)
				{
					min = val;
				}
			}
			
			return min;
		}
		
		/**
		 * Returns the minimum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the array minimum
		 */
		public static int of(int... array)
		{
			int min = Integers.MAX_VALUE;
			for(int val : array)
			{
				if(min > val)
				{
					min = val;
				}
			}
			
			return min;
		}

		
		private minimum()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code instance} operation creates new array instances.
	 * 
	 * @author Waffles
	 * @since Dec 8, 2016
	 * @version 1.0
	 */
	public static final class instance
	{
		/**
		 * Returns a new array of the specified type and length.
		 * 
		 * @param type  an array type to use
		 * @param length  an array length
		 * @return  a new array
		 */
		public static <O> O[] of(Class<O> type, int length)
		{
			return (O[]) java.lang.reflect.Array.newInstance(type, length);
		}
		
		/**
		 * Returns a new array of the specified type and length.
		 * 
		 * @param array  an array type to use
		 * @param length  an array length
		 * @return  a new array
		 */
		public static <O> O[] of(O[] array, int length)
		{
			return (O[]) of(array.getClass().getComponentType(), length);
		}
	}
	
	/**
	 * The {@code reverse} operation reverses the contents of arrays.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class reverse
	{
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static int[] of(int[] array)
		{
			int length = array.length;
			
			int[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
			
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static long[] of(long[] array)
		{
			int length = array.length;
			
			long[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
		
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static float[] of(float[] array)
		{
			int length = array.length;
			
			float[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
		
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static double[] of(double[] array)
		{
			int length = array.length;
			
			double[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
		
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static short[] of(short[] array)
		{
			int length = array.length;
			
			short[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
		
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static char[] of(char[] array)
		{
			int length = array.length;
			
			char[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}
		
		/**
		 * Returns a copy of an {@code Array} in reverse.
		 * 
		 * @param array  an array to reverse
		 * @return  the reverse array
		 */
		public static <O> O[] of(O[] array)
		{
			int length = array.length;
			
			O[] copy = Arrays.copyOf(array, length);
			for(int i = 0; i < length; i++)
			{
				copy[i] = array[length - i - 1];
			}
			
			return copy;
		}

		
		private reverse()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code remove} operation removes an object from an array.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class remove
	{
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static int[] from(int[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			int[] copy = new int[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
			
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static long[] from(long[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			long[] copy = new long[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
		
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static float[] from(float[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			float[] copy = new float[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
		
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static double[] from(double[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			double[] copy = new double[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
		
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static short[] from(short[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			short[] copy = new short[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
		
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static char[] from(char[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
			
			char[] copy = new char[length - 1];
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}
		
		/**
		 * Removes an object from an {@code Array}.
		 * 
		 * @param array  an array to remove from
		 * @param index  the index to remove
		 * @return  the resulting array
		 */
		public static <O> O[] from(O[] array, int index)
		{
			int length = array.length;
			if(index < 0 || length <= index)
			{
				return array;
			}
			
		
			O[] copy = instance.of(array, length - 1);
			for(int i = 0; i < length - 1; i++)
			{
				if(index <= i)
					copy[i] = array[i + 1];
				else
					copy[i] = array[i];
			}
			
			return copy;
		}

		
		private remove()
		{
			// NOT APPLICABLE
		}
	}

	/**
	 * The {@code product} operation computes an array product.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class product
	{
		/**
		 * Returns the product of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total product
		 */
		public static double of(double... array)
		{
			double prod = 1;
			for(double val : array)
			{
				prod *= val;
			}
			
			return prod;
		}
		
		/**
		 * Returns the product of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total product
		 */
		public static float of(float... array)
		{
			float prod = 1;
			for(float val : array)
			{
				prod *= val;
			}
			
			return prod;
		}
		
		/**
		 * Returns the product of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total product
		 */
		public static short of(short... array)
		{
			short prod = 1;
			for(short val : array)
			{
				prod *= val;
			}
			
			return prod;
		}
		
		/**
		 * Returns the product of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total product
		 */
		public static long of(long... array)
		{
			long prod = 1;
			for(long val : array)
			{
				prod *= val;
			}
			
			return prod;
		}
		
		/**
		 * Returns the product of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total product
		 */
		public static int of(int... array)
		{
			int prod = 1;
			for(int val : array)
			{
				prod *= val;
			}
			
			return prod;
		}

		
		private product()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code equals} operation compares contents of arrays.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class equals
	{
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static boolean of(int[] a1, int[] a2)
		{
			return Arrays.equals(a1, a2);
		}
		
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static boolean of(long[] a1, long[] a2)
		{
			return Arrays.equals(a1, a2);
		}
		
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static boolean of(short[] a1, short[] a2)
		{
			return Arrays.equals(a1, a2);
		}
		
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static boolean of(double[] a1, double[] a2)
		{
			return Arrays.equals(a1, a2);
		}
		
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static boolean of(float[] a1, float[] a2)
		{
			return Arrays.equals(a1, a2);
		}
				
		/**
		 * Compares the contents of two {@code Arrays}.
		 * 
		 * @param a1  the first array
		 * @param a2  the second array
		 * @return  {@code true} if contents are equal
		 */
		public static <O> boolean of(O[] a1, O[] a2)
		{
			return Arrays.equals(a1, a2);
		}
		
		
		private equals()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code parse} operation generates array format strings.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class parse
	{
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(int[] array)
		{
			return Arrays.toString(array);
		}
		
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(char[] array)
		{
			return Arrays.toString(array);
		}
		
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(long[] array)
		{
			return Arrays.toString(array);
		}
		
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(float[] array)
		{
			return Arrays.toString(array);
		}
		
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(double[] array)
		{
			return Arrays.toString(array);
		}
		
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static String of(short[] array)
		{
			return Arrays.toString(array);
		}
				
		/**
		 * Returns the string format of an {@code Array}.
		 * 
		 * @param array  an array to format
		 * @return  an array string
		 */
		public static <O> String of(O[] array)
		{
			return Arrays.toString(array);
		}

		
		private parse()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code cast} operation creates primitive array wrappers.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class cast
	{
		/**
		 * Returns a primitive of a wrapper {@code Array}.
		 * 
		 * @param array  a wrapper array
		 * @return  a primitive array
		 * 
		 * 
		 * @see Long
		 */
		public static long[] of(Long... array)
		{
			long[] copy = new long[array.length];
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
		 * 
		 * 
		 * @see Float
		 */
		public static float[] of(Float... array)
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
		 * 
		 * 
		 * @see Integer
		 */
		public static int[] of(Integer... array)
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
		 * 
		 * 
		 * @see Short
		 */
		public static short[] of(Short... array)
		{
			short[] copy = new short[array.length];
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
		 * 
		 * 
		 * @see Double
		 */
		public static double[] of(Double... array)
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
		 * 
		 * 
		 * @see Character
		 */
		public static char[] of(Character... array)
		{
			char[] copy = new char[array.length];
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
		 * 
		 * 
		 * @see Character
		 */
		public static Character[] of(char... array)
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
		 * 
		 * 
		 * @see Double
		 */
		public static Double[] of(double... array)
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
		 * 
		 * 
		 * @see Short
		 */
		public static Short[] of(short... array)
		{
			Short[] copy = new Short[array.length];
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
		 * 
		 * 
		 * @see Integer
		 */
		public static Integer[] of(int... array)
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
		 * 
		 * 
		 * @see Float
		 */
		public static Float[] of(float... array)
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
		 * 
		 * 
		 * @see Long
		 */
		public static Long[] of(long... array)
		{
			Long[] copy = new Long[array.length];
			for(int i = 0; i < array.length; i++)
			{
				copy[i] = array[i];
			}
			
			return copy;
		}

		
		private cast()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code copy} operation copies the contents of arrays.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.1
	 */
	public static final class copy
	{
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static boolean[] of(boolean[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static boolean[] of(boolean[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static boolean[] of(boolean[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static byte[] of(byte[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static byte[] of(byte[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static byte[] of(byte[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static double[] of(double[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static double[] of(double[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static double[] of(double[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static float[] of(float[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static float[] of(float[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static float[] of(float[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static short[] of(short[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static short[] of(short[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static short[] of(short[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static char[] of(char[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static char[] of(char[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
			
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static char[] of(char[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static long[] of(long[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static long[] of(long[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static long[] of(long[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static int[] of(int[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static int[] of(int[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static int[] of(int[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		/**
		 * Returns a copy of an {@code Array} from start to end.
		 * 
		 * @param array  an array to copy
		 * @param start  the start of the copy
		 * @param end  the end of the copy
		 * @return  the copied array
		 */
		public static <O> O[] of(O[] array, int start, int end)
		{
			return Arrays.copyOfRange(array, start, end);
		}
		
		/**
		 * Returns a copy of an {@code Array} with a new size.
		 * 
		 * @param array  an array to copy
		 * @param size  the size of the copy
		 * @return  the copied array
		 */
		public static <O> O[] of(O[] array, int size)
		{
			return Arrays.copyOf(array, size);
		}
		
		/**
		 * Returns a copy of an {@code Array}.
		 * 
		 * @param array  an array to copy
		 * @return  the copied array
		 */
		public static <O> O[] of(O[] array)
		{
			return Arrays.copyOf(array, array.length);
		}
		
		
		private copy()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code fill} operation fills an array with a value.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class fill
	{
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static int[] in(int[] array, int val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static char[] in(char[] array, char val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static long[] in(long[] array, long val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static float[] in(float[] array, float val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static double[] in(double[] array, double val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static short[] in(short[] array, short val)
		{
			Arrays.fill(array, val);
			return array;
		}
				
		/**
		 * Fills the contents of an {@code Array}.
		 * 
		 * @param array  an array to fill
		 * @param val  a value to fill
		 * @return  the filled array
		 */
		public static <O> O[] in(O[] array, O val)
		{
			Arrays.fill(array, val);
			return array;
		}
		
		
		private fill()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code hash} operation generates array hash codes.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class hash
	{
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(int[] array)
		{
			return Arrays.hashCode(array);
		}
		
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(char[] array)
		{
			return Arrays.hashCode(array);
		}
		
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(long[] array)
		{
			return Arrays.hashCode(array);
		}
		
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(float[] array)
		{
			return Arrays.hashCode(array);
		}
		
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(double[] array)
		{
			return Arrays.hashCode(array);
		}
		
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static int of(short[] array)
		{
			return Arrays.hashCode(array);
		}
				
		/**
		 * Returns the hash code of an {@code Array}.
		 * 
		 * @param array  an array to hash
		 * @return  a hash code
		 */
		public static <O> int of(O[] array)
		{
			return Arrays.hashCode(array);
		}

		
		private hash()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code sort} operation sorts the contents of arrays.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class sort
	{
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(double[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(double[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(float[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(float[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(short[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(short[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(char[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
			
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(char[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(long[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(long[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static void of(int[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static void of(int[] array)
		{
			Arrays.sort(array);
		}
		
		
		/**
		 * Sorts an {@code Array} from start to end.
		 * 
		 * @param array  an array to sort
		 * @param start  the start of the sort
		 * @param end  the end of the sort
		 */
		public static <O> void of(O[] array, int start, int end)
		{
			Arrays.sort(array, start, end);
		}
		
		/**
		 * Sorts an {@code Array}.
		 * 
		 * @param array  an array to sort
		 */
		public static <O> void of(O[] array)
		{
			Arrays.sort(array);
		}
		
		
		private sort()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code add} operation appends an array object.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class add
	{
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static int[] to(int[] array, int... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			int[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
		
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static char[] to(char[] array, char... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			char[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
		
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static long[] to(long[] array, long... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			long[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
		
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static float[] to(float[] array, float... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			float[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
		
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static double[] to(double[] array, double... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			double[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
		
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static short[] to(short[] array, short... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			short[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}
				
		/**
		 * Returns an {@code Array} appended with an object.
		 * 
		 * @param array  an array to append
		 * @param o  the objects to append
		 * @return  an appended array
		 */
		public static <O> O[] to(O[] array, O... o)
		{
			int oLen = array.length;
			int nLen = array.length + o.length;
			O[] copy = Array.copy.of(array, nLen);
			for(int i = oLen; i < nLen; i++)
			{
				copy[i] = o[i - oLen];
			}

			return copy;
		}

		
		private add()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code sum} operation calculates an array sum.
	 * 
	 * @author Waffles
	 * @since Dec 5, 2016
	 * @version 1.0
	 */
	public static final class sum
	{
		/**
		 * Returns the sum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total sum
		 */
		public static double of(double... array)
		{
			double sum = 0;
			for(double val : array)
			{
				sum += val;
			}
			
			return sum;
		}
		
		/**
		 * Returns the sum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total sum
		 */
		public static float of(float... array)
		{
			float sum = 0;
			for(float val : array)
			{
				sum += val;
			}
			
			return sum;
		}
		
		/**
		 * Returns the sum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total sum
		 */
		public static short of(short... array)
		{
			short sum = 0;
			for(short val : array)
			{
				sum += val;
			}
			
			return sum;
		}
		
		/**
		 * Returns the sum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total sum
		 */
		public static long of(long... array)
		{
			long sum = 0;
			for(long val : array)
			{
				sum += val;
			}
			
			return sum;
		}
		
		/**
		 * Returns the sum of a primitive {@code Array}.
		 * 
		 * @param array  a primitive array
		 * @return  the total sum
		 */
		public static int of(int... array)
		{
			int sum = 0;
			for(int val : array)
			{
				sum += val;
			}
			
			return sum;
		}
		
		
		private sum()
		{
			// NOT APPLICABLE
		}
	}
	
	/**
	 * The {@code set} operation adds array elements.
	 * Unsuitable arrays are automatically resized.
	 * 
	 * @author Waffles
	 * @since Jul 8, 2019
	 * @version 1.0
	 */
	public static final class set
	{
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static double[] at(double[] array, int iMin, double... vals)
		{
			int iMax = iMin + vals.length;
			
			double[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
		
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static float[] at(float[] array, int iMin, float... vals)
		{
			int iMax = iMin + vals.length;
			
			float[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
		
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static short[] at(short[] array, int iMin, short... vals)
		{
			int iMax = iMin + vals.length;
			
			short[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
		
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static long[] at(long[] array, int iMin, long... vals)
		{
			int iMax = iMin + vals.length;
			
			long[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
		
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static int[] at(int[] array, int iMin, int... vals)
		{
			int iMax = iMin + vals.length;
			
			int[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
		
		/**
		 * Sets elements at a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param iMin  an array start index
		 * @param vals  the elements to set
		 * @return  the updated array
		 */
		public static <O> O[] at(O[] array, int iMin, O... vals)
		{
			int iMax = iMin + vals.length;
			
			O[] result = array;
			if(array.length < iMax)
			{
				result = copy.of(array, iMax);
				
			}
			
			for(int i = iMin; i < iMax; i++)
			{
				result[i] = vals[i - iMin];
			}

			return result;
		}
	}
	
	/**
	 * The {@code set} operation gets array elements.
	 * Unsuitable arrays return zero or null.
	 * 
	 * @author Waffles
	 * @since Jul 8, 2019
	 * @version 1.0
	 */
	public static final class get
	{
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static double from(double[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return 0d;
		}
		
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static float from(float[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return 0f;
		}
		
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static short from(short[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return 0;
		}
		
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static long from(long[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return 0l;
		}
		
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static int from(int[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return 0;
		}
		
		/**
		 * Returns an element from a position in an {@code Array}.
		 * 
		 * @param array  an array to use
		 * @param index  an index to get
		 * @return  an array element
		 */
		public static <O> O from(O[] array, int index)
		{
			if(0 <= index && index < array.length)
			{
				return array[index];
			}
			
			return null;
		}
	}
	
	
	
	private Array()
	{
		// NOT APPLICABLE
	}
}