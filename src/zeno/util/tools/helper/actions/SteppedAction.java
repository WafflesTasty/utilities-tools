package zeno.util.tools.helper.actions;

import zeno.util.tools.patterns.manipulators.Executable;

/**
 * The {@code SteppedAction} class defines an action that can be stepped through.
 * 
 * @author Zeno
 * @since Sep 28, 2019
 * @version 1.0
 * 
 * 
 * @see Executable
 */
public class SteppedAction implements Executable
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

	@Override
	public void execute()
	{       
		switch(state)
		{
		case STARTING:
		{
			state = State.RUNNING;
			onStart(); return;
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
	 * An event raised when the {@code SteppedAction} has been started.
	 */
	public void onStart()
	{
		// NOT APPLICABLE
	}
	
	/**
	 * An event raised when the {@code SteppedAction} has been stepped.
	 */
	public void onStep()
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
		if(state != State.RUNNING)
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
		state = State.STEPPING;
	}
}