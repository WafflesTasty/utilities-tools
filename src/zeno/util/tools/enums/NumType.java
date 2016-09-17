package zeno.util.tools.enums;

import zeno.util.tools.primitives.Bytes;
import zeno.util.tools.primitives.Doubles;
import zeno.util.tools.primitives.Floats;
import zeno.util.tools.primitives.Integers;
import zeno.util.tools.primitives.Longs;
import zeno.util.tools.primitives.Shorts;

/**
 * The {@code NumType} enum defines numeric data types.
 * 
 * @since Sep 17, 2016
 * @author Zeno
 */
public enum NumType
{
	/**
	 * A 32-bit signed integer value.
	 */
	INTEGER(Integers.BYTE_SIZE),
	/**
	 * A 64-bit double precision value.
	 */
	DOUBLE(Doubles.BYTE_SIZE),
	/**
	 * A 32-bit floating point value.
	 */
	FLOAT(Floats.BYTE_SIZE),
	/**
	 * A 16-bit signed short value.
	 */
	SHORT(Shorts.BYTE_SIZE),
	/**
	 * An 8-bit signed byte value.
	 */
	BYTE(Bytes.BYTE_SIZE),
	/**
	 * A 64-but signed long value.
	 */
	LONG(Longs.BYTE_SIZE);
	
	
	private int bytes;
	
	private NumType(int bytes)
	{
		this.bytes = bytes;
	}
	
	/**
	 * Returns the byte size of the {@code NumType}.
	 * 
	 * @return  the type's byte size
	 */
	public int ByteSize()
	{
		return bytes;
	}
}