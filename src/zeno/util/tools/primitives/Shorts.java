package zeno.util.tools.primitives;

/**
 * The {@code Shorts} class defines basic operations for {@link Short} values.
 * 
 * @author Zeno
 * @since Jun 3, 2016
 * @version 1.0
 */
public final class Shorts
{
	// Constants
		
	/**
	 * Defines the minimum positive value in short precision.
	 */
	public static final short MIN_VALUE = Short.MIN_VALUE;
	
	/**
	 * Defines the maximum positive value in short precision.
	 */
	public static final short MAX_VALUE = Short.MAX_VALUE;
	
	/**
	 * Defines the byte size of a single short number.
	 */
	public static final int BYTE_SIZE = Short.BYTES;
	
	/**
	 * Defines the bit size of a single short number.
	 */
	public static final int BIT_SIZE = Short.SIZE;

			
	// Parsing

	/**
	 * Parses a string into an short value.
	 * <br> This methods can return shorts
	 * in any base radix.
	 * 
	 * @param text  a string to parse
	 * @param rad  a base radix
	 * @return  a parsed short
	 * 
	 * 
	 * @see String
	 */
	public static short parse(String text, int rad)
	{
		return Short.parseShort(text, rad);
	}
	
	/**
	 * Parses a string into a short value.
	 * 
	 * @param text  a string to parse
	 * @return  a parsed short
	 * 
	 * 
	 * @see String
	 */
	public static short parse(String text)
	{
		return Short.parseShort(text);
	}
	
	/**
	 * Returns a hash code of a short.
	 * 
	 * @param val  a value to hash
	 * @return  a hash code
	 */
	public static int hashCode(short val)
	{
		return Short.hashCode(val);
	}

	
	private Shorts()
	{
		// NOT APPLICABLE
	}
}