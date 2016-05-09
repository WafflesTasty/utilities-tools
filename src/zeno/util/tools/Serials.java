package zeno.util.tools;

import java.io.Serializable;

/**
 * The {@code Serials} enumeration defines all of the serial numbers 
 * used in the various {@code Jade} libraries.
 * 
 * @author Zeno
 * @since Mar 4, 2016
 * @see Serializable
 */
@SuppressWarnings("javadoc")
public enum Serials
{
	/**
	 * Utilities
	 */
	
		// COLLECTIONS
		
		UTIL_COLL_CLASSMAP		(1001000l),
		UTIL_COLL_SETTINGS		(1001001l),
		
		// IO TOOLS
		
		UTIL_IO_HSBCOLOR		(1002000l),
		
		// LANGUAGE
		
		UTIL_LANG_DATE			(1003000l),
		UTIL_LANG_TIME			(1003001l),
	
	
	/**
	 * Jade Core
	 */
	
		// <NONE>
	
	
	/**
	 * Engines
	 */
	
		// ROGUELUST
		
		ENG_RL_DATE				(3001000l),
		
		
	/**
	 * Default value
	 */
		
		UNBOUND					(9999999l);
	
		
	private long number;
	
	private Serials(long number)
	{
		this.number = number;
	}
	
	/**
	 * Returns the serial number of this type.
	 * @return  the type's serial number
	 */
	public long number()
	{
		return number;
	}
}