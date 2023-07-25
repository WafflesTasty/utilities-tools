package waffles.util.tools.primitives;

/**
 * The {@code Bytes} class defines basic operations for {@link Byte} values.
 * 
 * @author Waffles
 * @since Jun 3, 2016
 * @version 1.0
 */
public final class Bytes
{
	// Constants
	
	/**
	 * Defines the minimum positive value in byte precision.
	 */
	public static final byte MIN_VALUE = Byte.MIN_VALUE;
		
	/**
	 * Defines the maximum positive value in byte precision.
	 */
	public static final byte MAX_VALUE = Byte.MAX_VALUE;
		
	/**
	 * Defines the byte size of a single byte number.
	 */
	public static final int BYTE_SIZE = Byte.BYTES;
		
	/**
	 * Defines the bit size of a single byte number.
	 */
	public static final int BIT_SIZE = Byte.SIZE;
	
	
	// Parsing

	/**
	 * Parses a string into an byte value.
	 * </br> This methods can return bytes
	 * in any base radix.
	 * 
	 * @param text  a string to parse
	 * @param rad  a base radix
	 * @return  a parsed byte
	 * 
	 * 
	 * @see String
	 */
	public static byte parse(String text, int rad)
	{
		return Byte.parseByte(text, rad);
	}
	
	/**
	 * Parses a string into a byte value.
	 * 
	 * @param text  a string to parse
	 * @return  a parsed byte
	 * 
	 * 
	 * @see String
	 */
	public static byte parse(String text)
	{
		return Byte.parseByte(text);
	}
	
	/**
	 * Returns a hash code of a byte.
	 * 
	 * @param val  a value to hash
	 * @return  a hash code
	 */
	public static int hashCode(byte val)
	{
		return Byte.hashCode(val);
	}

	
	private Bytes()
	{
		// NOT APPLICABLE
	}
}