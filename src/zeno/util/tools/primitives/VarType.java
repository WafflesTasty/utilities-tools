package zeno.util.tools.primitives;

/**
 * The {@code VarType} enum defines base object types.
 * 
 * @author Zeno
 * @since Mar 26, 2017
 * @version 1.0
 */
public enum VarType
{
	/**
	 * A 16-bit unicode character value.
	 */
	CHARACTER(2),
	/**
	 * A 32-bit signed integer value.
	 */
	INTEGER(4),
	/**
	 * An object value of undefined size.
	 */
	OBJECT(0),
	/**
	 * A 64-bit double precision value.
	 */
	DOUBLE(8),
	/**
	 * A 16-bit signed short value.
	 */
	SHORT(2),
	/**
	 * A 32-bit floating point value.
	 */
	FLOAT(4),
	/**
	 * An 8-bit signed byte value.
	 */
	BYTE(1),
	/**
	 * A 64-bit signed long value.
	 */
	LONG(8);
	
	
	private int bytes;
	
	private VarType(int bytes)
	{
		this.bytes = bytes;
	}
	
	/**
	 * Returns the size of the {@code VarType}.
	 * 
	 * @return  the type's byte size
	 */
	public int ByteSize()
	{
		return bytes;
	}
}