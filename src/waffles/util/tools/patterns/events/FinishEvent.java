package waffles.util.tools.patterns.events;

/**
 * The {@code FinishEvent} interface defines an {{@link #onFinished()} event.
 *
 * @author Waffles
 * @since 18 Feb 2020
 * @version 1.1
 */
public interface FinishEvent
{
	/**
	 * An event raised on finishing the {@code FinishEvent}.
	 */
	public default void onFinished()
	{
		// NOT APPLICABLE
	}
}