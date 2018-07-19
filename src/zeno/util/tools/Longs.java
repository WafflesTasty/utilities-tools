package zeno.util.tools;

/**
 * The {@code Longs} class defines basic operations for {@link Long} values.
 * 
 * @author Zeno
 * @since Jun 3, 2016
 * @version 1.0
 */
public final class Longs
{
	// Constants
	
	/**
	 * Defines the minimum positive value in long precision.
	 */
	public static final long MIN_VALUE = Long.MIN_VALUE;
	/**
	 * Defines the maximum positive value in long precision.
	 */
	public static final long MAX_VALUE = Long.MAX_VALUE;
	
	/**
	 * Defines the byte size of a single long number.
	 */
	public static final int BYTE_SIZE = Long.BYTES;
	/**
	 * Defines the bit size of a single long number.
	 */
	public static final int BIT_SIZE = Long.SIZE;

	
	// Bitcodes
	
	/**
	 * Returns a single bit in a value.
	 * 
	 * @param val  a value to use
	 * @param pos  the bit position
	 * @return  a single bit
	 */
	public static long bitAt(long val, int pos)
	{
		return ((val >> pos) & 1);
	}
	
	/**
	 * Returns the reverse bits of a value.
	 * 
	 * @param val  a value to use
	 * @return  the reversed value
	 */
	public static long reverseBits(long val)
	{
		return Long.reverse(val);
	}
	
	/**
	 * Returns the trailing zero count of a value.
	 * 
	 * @param val  a value to use
	 * @return  the trailing zero count
	 */
	public static long trailZeroes(long val)
	{
		return Long.numberOfTrailingZeros(val);
	}
	
	/**
	 * Returns the leading zero count of a value.
	 * 
	 * @param val  a value to use
	 * @return  the leading zero count
	 */
	public static long leadZeroes(long val)
	{
		return Long.numberOfLeadingZeros(val);
	}
	
	/**
	 * Returns the highest one bit in the value.
	 * 
	 * @param val  a value to use
	 * @return  the highest one bit
	 */
	public static long highestBit(long val)
	{
		return Long.highestOneBit(val);
	}
	
	/**
	 * Returns the lowest one bit in the value.
	 * 
	 * @param val  a value to use
	 * @return  the lowest one bit
	 */
	public static long lowestBit(long val)
	{
		return Long.lowestOneBit(val);
	}
	
	/**
	 * Returns the one bits in the value.
	 * 
	 * @param val  a value to use
	 * @return  the one bit count
	 */
	public static long bitcount(long val)
	{
		return Long.bitCount(val);
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
	public static long pow(long x, long p)
	{
		return (long) Math.pow(x, p);
	}	
	
	
	// Extremes
	
	/**
	 * Returns the absolute of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  a list of absolutes
	 */
	public static long[] abs(long... vals)
	{
		long[] result = new long[vals.length];
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
	 * @return  the list's minimum
	 */
	public static long min(long... vals)
	{
		long res = MAX_VALUE;
		for(long val : vals)
		{
			res = Math.min(res, val);
		}
		
		return res;
	}
		
	/**
	 * Returns the maximum of a list of values.
	 * 
	 * @param vals  a list of values
	 * @return  the list's maximum
	 */
	public static long max(long... vals)
	{
		long res = -MAX_VALUE;
		for(long val : vals)
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
	public static long sign(long val)
	{
		return Long.signum(val);
	}

	/**
	 * Returns the absolute of a value.
	 * 
	 * @param val  a value to use
	 * @return  the value's absolute
	 */
	public static long abs(long val)
	{
		return Math.abs(val);
	}	
	
	
	// Parsing
	
	/**
	 * Converts a long into a string value.
	 * <br> This methods can return strings for
	 * longs in any base radix.
	 * 
	 * @param val  a value to convert
	 * @param rad  a base radix
	 * @return  a long string
	 * 
	 * 
	 * @see String
	 */
	public static String toString(long val, int rad)
	{
		return Long.toString(val, rad);
	}
	
	/**
	 * Parses a string into an long value.
	 * <br> This methods can return longs
	 * in any base radix.
	 * 
	 * @param text  a string to parse
	 * @param rad  a base radix
	 * @return  a parsed long
	 * 
	 * 
	 * @see String
	 */
	public static long parse(String text, int rad)
	{
		return Long.parseLong(text, rad);
	}
	
	/**
	 * Parses a string into a long value.
	 * 
	 * @param text  a string to parse
	 * @return  a parsed long
	 * 
	 * 
	 * @see String
	 */
	public static long parse(String text)
	{
		return Long.parseLong(text);
	}
	
	/**
	 * Returns a hash code of a long.
	 * 
	 * @param val  a value to hash
	 * @return  a hash code
	 */
	public static int hashCode(long val)
	{
		return Long.hashCode(val);
	}
	
	
	// Rounding
	
	/**
	 * Clamps a value between a minimum and a maximum.
	 * 
	 * @param val  a value to clamp
	 * @param min  the value's minimum
	 * @param max  the value's maximum
	 * @return  a clamped value
	 */
	public static long clamp(long val, long min, long max)
	{
		return Math.max(min, Math.min(val, max));
	}
	
	/**
	 * Returns the long closest to a value.
	 * 
	 * @param val  a value to use
	 * @return  a rounded value
	 */
	public static long round(double val)
	{
		return Math.round(val);
	}
	
	/**
	 * Returns the lower long closest to a value.
	 * 
	 * @param val  a value to round
	 * @return  a rounded value
	 */
	public static long floor(double val)
	{
		return (long) Math.floor(val);
	}

	/**
	 * Returns the higher long closest to a value.
	 * 
	 * @param val  a value to round
	 * @return  a rounded value
	 */
	public static long ceil(double val)
	{
		return (long) Math.ceil(val);
	}	
	
	
	private Longs()
	{
		// NOT APPLICABLE
	}
}