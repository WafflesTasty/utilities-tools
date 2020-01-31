package zeno.util.tools.helper.actions.timed;

import zeno.util.tools.patterns.manipulators.Executable;

/**
 * The {@code TimedAction} class defines an action that executes based on time passed.
 * </br> To change the logic executed on every delta, override the {@link #onUpdate(long)} event.
 *
 * @author Zeno
 * @since Dec 3, 2014
 * @version 1.0
 * 
 * 
 * @see Executable
 */
public class DeltaAction implements Executable
{	
	private enum State
	{
		STARTING,
		RUNNING;
	}
	
	
	private State state;
	private long current, last;

	/**
	 * Creates a new {@code TimedAction}.
	 * <br> The default interval is 16ms.
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
	
	
	@Override
	public void execute()
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