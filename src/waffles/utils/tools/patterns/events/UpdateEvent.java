package waffles.utils.tools.patterns.events;

/**
 * The {@code UpdateEvent} interface defines an {@link #onUpdate()} event.
 *
 * @author Waffles
 * @since 23 Feb 2020
 * @version 1.1
 */
public interface UpdateEvent
{
	/**
	 * An event raised on updating the {@code UpdateEvent}.
	 */
	public default void onUpdate()
	{
		// NOT APPLICABLE
	}
}