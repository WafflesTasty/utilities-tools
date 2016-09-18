package zeno.util.tools.actions;

import zeno.util.tools.Messenger;
import zeno.util.tools.generic.manipulators.Executable;

/**
 * The {@code LoaderAction} class defines an action used as a background loading task.
 * <br> To add additional logic after the action completes, override the {@link #onFinished()} event.
 * 
 * @since Nov 29, 2014
 * @author Zeno
 * 
 * @see Messenger
 * @see Executable
 */
public class LoaderAction extends Messenger implements Executable
{
	private enum State
	{
		IDLE,
		BOOTING,
		WORKING,
		FINISHED;
	}
	
	
	private State state;
	private Thread loader;
	
	/**
	 * Creates a new {@code LoaderAction}.
	 * 
	 * @param task  a task to use
	 * @see Runnable
	 */
	public LoaderAction(Runnable task)
	{
		setTask(task);
	}
	
	/**
	 * Creates a new {@code LoaderAction}.
	 */
	public LoaderAction()
	{
		this(null);
	}
		
	
	/**
	 * Starts the {@code LoaderAction}.
	 */
	public void startTask()
	{
		state = State.BOOTING;
	}
	
	/**
	 * Changes the task of the {@code LoaderAction}.
	 * 
	 * @param task  a task to run
	 * @see Runnable
	 */
	public void setTask(Runnable task)
	{
		loader = new Thread(task);
		state = State.IDLE;
	}
	
	/**
	 * An event raised when the task is finished.
	 */
	public void onFinished()
	{
		// NOT APPLICABLE
	}
		
	
	@Override
	public void execute()
	{
		switch(state)
		{
		case BOOTING:
		{
			state = State.WORKING;
			loader.start();
			break;
		}
		case WORKING:
		{
			if(!loader.isAlive())
			{
				state = State.FINISHED;
			}
			
			break;
		}
		case FINISHED:
		{
			state = State.IDLE;
			onFinished();
			break;
		}
		case IDLE:
		default:
			break;
		}
	}
}