package zeno.util.tools.helper.iterables;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * The {@code StreamIterable} class defines an {@code Iterable} over a {@code Stream}.
 * </br> This iterable needs to be closed after use, i.e. with a try-with-resources. 
 * 
 * @author Zeno
 * @since Sep 17, 2019
 * @version 1.0
 * 
 * 
 * @param <O>  the type of objects to iterate
 * @see Closeable
 * @see Iterable
 */
public class StreamIterable<O> implements Closeable, Iterable<O>
{
	private Stream<O> stream;
	
	/**
	 * Creates a new {@code StreamIterable}.
	 * 
	 * @param s  a stream to iterate
	 * 
	 * 
	 * @see Stream
	 */
	public StreamIterable(Stream<O> s)
	{
		stream = s;
	}
	
	
	@Override
	public void close() throws IOException
	{
		stream.close();
	}
	
	@Override
	public Iterator<O> iterator()
	{
		return stream.iterator();
	}

	
	/**
	 * Checks if the {@code StreamIterable} is empty.
	 * 
	 * @return  {@code true} if the stream is empty
	 */
	public boolean isEmpty()
	{
		return Count() == 0;
	}
	
	/**
	 * Returns the count of the {@code StreamIterable}.
	 * 
	 * @return  an object count
	 */
	public long Count()
	{
		return stream.count();
	}
}