package zeno.util.tools.helper.tasks;

import zeno.util.tools.helper.Action;

/**
 * The {@code DeltaAction} class defines a task that executes based on time passed.
 * </br> To change the logic executed on every delta, override the {@link #onUpdate(long)} event.
 *
 * @author Zeno
 * @since Dec 3, 2014
 * @version 1.1
 * 
 * 
 * @see Action
 */
public class DeltaAction implements Action
{	
	private enum State
	{
		STARTING,
		RUNNING;
	}
	
	
	private State state;
	private long current, last;

	/**
	 * Creates a new {@code DeltaAction}.
	 */
	public DeltaAction()
	{
		state = State.STARTING;
	}

	/**
	 * An event raised when the {@code DeltaAction} updates.
	 * 
	 * @param delta  a delta time value
	 */
	public void onUpdate(long delta)
	{
		// NOT APPLICABLE
	}
	
	/**
	 * Resets the {@code DeltaAction}.
	 */
	public void reset()
	{
		state = State.STARTING;
	}
	
	
	@Override
	public void onUpdate()
	{
		last = current;
		
		// Check the current system time.
		current = System.currentTimeMillis();
		if(state == State.STARTING)
		{
			// Skip the first run to avoid delta explosion.
			state = State.RUNNING;
			return;
		}
		
		// Update the action on delta time.
		onUpdate(current - last);
	}
}