package zeno.util.tools;

import java.util.function.Consumer;

/**
 * The {@code Messenger} interface defines an object that handles message strings.
 * <br> Each message string is sent to the messenger's output, if any. A standard output 
 * is provided which sends messages to Java's console.
 * 
 * @author Zeno
 * @since Oct 16, 2014
 * @version 1.0
 */
public interface Messenger
{		
	/**
	 * The {@code STDOut} object defines standard console output.
	 * 
	 * 
	 * @see Consumer
	 * @see String
	 */
	public static Consumer<String> STD_OUT = new Consumer<String>()
	{
		@Override
		public void accept(String message)
		{
			System.out.println(message);
		}
	};

	
	/**
	 * Sends a message through the output of the {@code Messenger}.
	 * 
	 * @param message  a message to send
	 */
	public default void sendMessage(String message)
	{
		if(Output() != null)
		{
			Output().accept(message);
		}
	}

	/**
	 * Returns the output method of the {@code Messenger}.
	 * 
	 * @return  the messenger's output
	 * 
	 * 
	 * @see Consumer
	 * @see String
	 */
	public abstract Consumer<String> Output();
}