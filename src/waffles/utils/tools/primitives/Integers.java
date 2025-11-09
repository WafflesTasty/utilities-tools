package waffles.utils.tools.primitives;

/**
 * The {@code Integers} class defines basic operations for {@link Integer} values.
 * 
 * @author Waffles
 * @since Jun 3, 2016
 * @version 1.0
 */
public final class Integers
{
	// Constants
	
	/**
	 * Defines the minimum positive value in integer precision.
	 */
	public static final int MIN_VALUE = Integer.MIN_VALUE;
	/**
	 * Defines the maximum positive value in integer precision.
	 */
	public static final int MAX_VALUE = Integer.MAX_VALUE;
	
	/**
	 * Defines the byte size of a single integer number.
	 */
	public static final int BYTE_SIZE = Integer.BYTES;
	/**
	 * Defines the bit size of a single integer number.
	 */
	public static final int BIT_SIZE = Integer.SIZE;

	
	// Bitcodes
	
	/**
	 * Returns a single bit in a value.
	 * 
	 * @param val  a value to use
	 * @param pos  the bit position
	 * @return  a single bit
	 */
	public static int bitAt(int val, int pos)
	{
		return ((val >> pos) & 1);
	}
	
	/**
	 * Returns the reverse bits of a value.
	 * 
	 * @param val  a value to use
	 * @return  the reversed value
	 */
	public static int reverseBits(int val)
	{
		return Integer.reverse(val);
	}
	
	/**
	 * Returns the trailing zero count of a value.
	 * 
	 * @param val  a value to use
	 * @return  the trailing zero count
	 */
	public static int trailZeroes(int val)
	{
		return Integer.numberOfTrailingZeros(val);
	}
	
	/**
	 * Returns the leading zero count of a value.
	 * 
	 * @param val  a value to use
	 * @return  the leading zero count
	 */
	public static int leadZeroes(int val)
	{
		return Integer.numberOfLeadingZeros(val);
	}
	
	/**
	 * Returns the highest one bit in the value.
	 * 
	 * @param val  a value to use
	 * @return  the highest one bit
	 */
	public static int highestBit(int val)
	{
		return Integer.highestOneBit(val);
	}
	
	/**
	 * Returns the lowest one bit in the value.
	 * 
	 * @param val  a value to use
	 * @return  the lowest one bit
	 */
	public static int lowestBit(int val)
	{
		return Integer.lowestOneBit(val);
	}
	
	/**
	 * Returns the one bits in the value.
	 * 
	 * @param val  a value to use
	 * @return  the one bit count
	 */
	public static int bitcount(int val)
	{
		return Integer.bitCount(val);
	}

	
	// Exponential
	
	/**
	 * Returns a value raised to the power of an exponent.
	 * 
	 * </br> Special cases:
	 * <ul>
	 * 		<li>If the second argument is positive or negative zero, then the result is 1.0.</li>
	 * 		<li>If the second argument is 1.0, then the result is the same as the first argument.</li>
	 * 		<li>If the second argument is NaN, then the result is NaN.</li>
	 * 		<li>If the first argument is NaN and the second argument is nonzero, then the result is NaN.</li>
	 * </ul>
	 * 
	 * @param x  the power's base
	 * @param p  the power's exponent
	 * @return  the base raised to the exponent
	 */
	public static int pow(int x, int p)
	{
		return (int) Math.pow(x, p);
	}	
	
	
	// Extremes
	
	/**
	 * Returns the minimum of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list minimum
	 * 
	 * 
	 * @see Iterable
	 */
	public static int min(Iterable<Integer> vals)
	{
		int res = MAX_VALUE;
		for(int val : vals)
		{
			res = Math.min(res, val);
		}
		
		return res;
	}
		
	/**
	 * Returns the maximum of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list maximum
	 * 
	 * 
	 * @see Iterable
	 */
	public static int max(Iterable<Integer> vals)
	{
		int res = -MAX_VALUE;
		for(int val : vals)
		{
			res = Math.max(res, val);
		}
		
		return res;
	}
	
	/**
	 * Returns the absolute of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list of absolutes
	 */
	public static int[] abs(int... vals)
	{
		int[] result = new int[vals.length];
		for(int i = 0; i < vals.length; i++)
		{
			result[i] = Math.abs(vals[i]);
		}
		
		return result;
	}
	
	/**
	 * Returns the minimum of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list minimum
	 */
	public static int min(int... vals)
	{
		int res = MAX_VALUE;
		for(int val : vals)
		{
			res = Math.min(res, val);
		}
		
		return res;
	}
		
	/**
	 * Returns the maximum of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list maximum
	 */
	public static int max(int... vals)
	{
		int res = -MAX_VALUE;
		for(int val : vals)
		{
			res = Math.max(res, val);
		}
		
		return res;
	}
	
	/**
	 * Returns the sign function of the value.
	 * 
	 * @param val  a value to use
	 * @return  the value's sign
	 */
	public static int sign(int val)
	{
		return Integer.signum(val);
	}

	/**
	 * Returns the absolute of a value.
	 * 
	 * @param val  a value to use
	 * @return  the value's absolute
	 */
	public static int abs(int val)
	{
		return Math.abs(val);
	}
	
	
	// Parsing
	
	/**
	 * Converts an integer into a string value.
	 * <br> This methods can return strings for
	 * integers in any base radix.
	 * 
	 * @param val  a value to convert
	 * @param rad  a base radix
	 * @return  an integer string
	 * 
	 * 
	 * @see String
	 */
	public static String toString(int val, int rad)
	{
		return Integer.toString(val, rad);
	}
	
	/**
	 * Parses a string into an integer value.
	 * <br> This methods can return integers
	 * in any base radix.
	 * 
	 * @param text  a string to parse
	 * @param rad  a base radix
	 * @return  a parsed integer
	 * 
	 * 
	 * @see String
	 */
	public static int parse(String text, int rad)
	{
		return Integer.parseInt(text, rad);
	}
	
	/**
	 * Parses a string to an integer value.
	 * 
	 * @param text  a string to parse
	 * @return  a parsed integer
	 * 
	 * 
	 * @see String
	 */
	public static int parse(String text)
	{
		return Integer.decode(text);
	}
	
	/**
	 * Returns a hash code of an integer.
	 * 
	 * @param val  a value to hash
	 * @return  a hash code
	 */
	public static int hashCode(int val)
	{
		return Integer.hashCode(val);
	}
	
	
	// Rounding
	
	/**
	 * Returns the gcd of two values.
	 * 
	 * @param a  a first value
	 * @param b  a second value
	 * @return  a greatest divisor
	 */
	public static int gcd(int a, int b)
	{
		if(b == 0) return a;
		return gcd(b, Integers.mod(a, b));
	}
	
	/**
	 * Clamps a value between a minimum and a maximum.
	 * 
	 * @param val  a value to clamp
	 * @param min  the value's minimum
	 * @param max  the value's maximum
	 * @return  a clamped value
	 */
	public static int clamp(int val, int min, int max)
	{
		return Math.max(min, Math.min(val, max));
	}
	
	/**
	 * Performs the standard modulo operation on a value.
	 * 
	 * @param val  a value to mod
	 * @param mod  a modulo operator
	 * @return  a modulo value
	 */
	public static int mod(int val, int mod)
	{
		return ((val % mod) + mod) % mod;
	}
	
	/**
	 * Returns an integer rounded to the closest value.
	 * 
	 * @param val  a value to use
	 * @return  a rounded value
	 */
	public static int round(float val)
	{
		return Math.round(val);
	}
	
	/**
	 * Returns the lower integer closest to a value.
	 * 
	 * @param val  a value to round
	 * @return  a rounded value
	 */
	public static int floor(float val)
	{
		return (int) Math.floor(val);
	}

	/**
	 * Returns the higher integer closest to a value.
	 * 
	 * @param val  a value to round
	 * @return  a rounded value
	 */
	public static int ceil(float val)
	{
		return (int) Math.ceil(val);
	}
		
	
	// Arrays
	
	/**
	 * Returns an array of integers in increasing order.
	 * 
	 * @param from  an initial array element
	 * @param to  an approximate final array element
	 * @param step  an element step increase
	 * @return  an array of integers
	 */
	public static int[] list(int from, int to, int step)
	{
		int k = (to - from) / step + 1;
		
		int[] list = new int[k];
		for(int i = 0; i < k; i++)
		{
			list[i] = from + i * step;
		}
		
		return list;
	}
	
	/**
	 * Returns an array of integers in increasing order.
	 * This array has a step size of 1.
	 * 
	 * @param from  an initial array element
	 * @param to  an approximate final array element
	 * @return  an array of integers
	 */
	public static int[] list(int from, int to)
	{
		return list(from, to, 1);
	}
	
	/**
	 * Returns an array of integers in increasing order.
	 * This array starts at 0 and has a step size of 1.
	 * 
	 * @param to  an approximate final array element
	 * @return  an array of integers
	 */
	public static int[] list(int to)
	{
		return list(0, to);
	}
	
	
	private Integers()
	{
		// NOT APPLICABLE
	}

}