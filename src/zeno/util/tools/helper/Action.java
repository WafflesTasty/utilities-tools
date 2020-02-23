package zeno.util.tools.helper;

/**
 * The {@code Action} interface defines an object that performs a task throughout a loop.
 *
 * @author Zeno
 * @since 23 Feb 2020
 * @version 1.1
 */
public interface Action
{
	/**
	 * An event raised when updating the {@code Action}.
	 */
	public default void onUpdate()
	{
		// NOT APPLICABLE
	}
}