package waffles.utils.tools.patterns;

/**
 * The {@code Broadcaster} interface defines an object that sends message strings.
 * </br> Each {@code Broadcaster} targets an empty output by default.
 * 
 * @author Waffles
 * @since Oct 16, 2014
 * @version 1.0
 */
public interface Broadcaster
{
	/**
	 * The {@code Broadcaster.Output} interface receives messages from a {@code Broadcaster}.
	 * </br> The {@link Broadcaster#STD_OUT} variable defines an output to Java's console.
	 *
	 * @author Waffles
	 * @since 25 Jul 2023
	 * @version 1.0
	 */
	@FunctionalInterface
	public static interface Output
	{
		/**
		 * Receives a message into the {@code Output}.
		 * 
		 * @param msg  a message received
		 * 
		 * 
		 * @see String
		 */
		public abstract void receive(String msg);
	}
	
	/**
	 * The {@code STD_OUT} object defines standard console output.
	 * 
	 * 
	 * @see Output
	 */
	public static Output STD_OUT = (msg) -> System.out.println(msg);
	
	/**
	 * The {@code VOID} object defines a null message output.
	 */
	public static Output VOID = (msg) -> {};

	
	/**
	 * Sends a message from the {@code Broadcaster} to its {@code Output}.
	 * 
	 * @param msg  a message sent
	 */
	public default void send(String msg)
	{
		if(Output() != null)
		{
			Output().receive(msg);
		}
	}

	/**
	 * Returns the {@code Output} of the {@code Broadcaster}.
	 * 
	 * @return  a message output
	 * 
	 * 
	 * @see Output
	 */
	public default Output Output()
	{
		return VOID;
	}
}