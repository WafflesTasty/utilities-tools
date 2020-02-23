package zeno.util.tools.helper.tasks;

import zeno.util.tools.helper.Action;

/**
 * The {@code SteppedAction} class defines a task that can be paused and stepped through.
 * 
 * @author Zeno
 * @since Sep 28, 2019
 * @version 1.1
 * 
 * 
 * @see Action
 */
public class SteppedAction implements Action
{
	private static enum State
	{
		STARTING,
		STOPPING,
		STEPPING,
		RUNNING,
		PAUSED;
	}
	
	
	private State state;
	
	/**
	 * Creates a new {@code SteppedAction}.
	 */
	public SteppedAction()
	{
		state = State.STARTING;
	}

	/**
	 * Checks if the {@code SteppedAction} is paused.
	 * 
	 * @return  {@code true} if the action is paused
	 */
	public boolean isPaused()
	{
		return state == State.PAUSED;
	}
	
	
	@Override
	public void onUpdate()
	{       
		switch(state)
		{
		case STARTING:
		{
			state = State.RUNNING;
			onResume(); return;
		}
		case STOPPING:
		{
			state = State.PAUSED;
			onStop(); return;
		}
		case STEPPING:
		{
			state = State.PAUSED;
			onStep(); return;
		}
		case RUNNING:
			onRun();
		case PAUSED:
		default:
			return;
		}
	}
	
		
	/**
	 * An event raised when the {@code SteppedAction} has been stepped.
	 */
	public void onStep()
	{
		// NOT APPLICABLE
	}
	
	/**
	 * An event raised when the {@code SteppedAction} has been resumed.
	 */
	public void onResume()
	{
		// NOT APPLICABLE
	}
	
	/**
	 * An event raised when the {@code SteppedAction} has been stopped.
	 */
	public void onStop()
	{
		// NOT APPLICABLE
	}
	
	/**
	 * An event raised while the {@code SteppedAction} is running.
	 */
	public void onRun()
	{
		// NOT APPLICABLE
	}
	
	
	/**
	 * Pauses the events of the {@code SteppedAction}.
	 */
	public void pause()
	{
		state = State.STOPPING;
	}
	
	/**
	 * Starts the events of the {@code SteppedAction}.
	 * </br> This does nothing if events are already running.
	 */
	public void start()
	{
		if(state == State.PAUSED)
		{
			state = State.STARTING;
		}
	}
	
	/**
	 * Steps the events of the {@code SteppedAction}.
	 * 
	 */
	public void step()
	{
		if(state == State.PAUSED)
		{
			state = State.STEPPING;
		}
	}
}