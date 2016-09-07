package zeno.util.tools;

import java.util.function.Consumer;

/**
 * The {@code Messenger} class defines an object that handles message strings.
 * <br> Each message string is sent to the messenger's output, if any. A standard output 
 * is provided which sends messages to Java's console.
 * 
 * @since Oct 16, 2014
 * @author Zeno
 */
public abstract class Messenger
{			
	/**
	 * The {@code STDOut} class defines standard console output.
	 *
	 * @since Dec 19, 2014
	 * @author Zeno
	 * 
	 * @see Consumer
	 */
	public static class STDOut implements Consumer<String>
	{
		@Override
		public void accept(String message)
		{
			System.out.println(message);
		}
	}
	
	
	private Consumer<String> output;
	
	/**
	 * Sets an output object to receive messages from the {@code Messenger}.
	 * 
	 * @param output  an output object to use
	 * @see Consumer
	 */
	public void setOutput(Consumer<String> output)
	{
		this.output = output;
	}
		
	/**
	 * Sends a message through the output of the {@code Messenger}.
	 * 
	 * @param message  a message to send
	 */
	public void sendMessage(String message)
	{
		if(output != null)
		{
			output.accept(message);
		}
	}
}