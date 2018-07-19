package zeno.util.tools;

/**
 * The {@code Booleans} class defines basic operations for boolean values.
 *
 * @author Zeno
 * @since May 4, 2016
 * @version 1.0
 */
public final class Booleans
{
	// Parsing
	
	/**
	 * Parses a string to a boolean value.
	 * 
	 * @param text  a string to parse
	 * @return  a parsed boolean
	 * 
	 * 
	 * @see String
	 */
	public static boolean parse(String text)
	{
		return Boolean.parseBoolean(text);
	}
	
	/**
	 * Returns a hash code of a boolean value.
	 * 
	 * @param val  a value to hash
	 * @return  a hash code
	 */
	public static int hashCode(boolean val)
	{
		return Boolean.hashCode(val);
	}
	
	
	private Booleans()
	{
		// NOT APPLICABLE
	}
}