package zeno.util.tools.actions;

import java.util.function.Consumer;

import zeno.util.tools.Messenger;
import zeno.util.tools.patterns.manipulators.Executable;

/**
 * The {@code LoaderAction} class defines an action used as a background loading task.
 * <br> To add additional logic after the action completes, override the {@link #onFinished()} event.
 * 
 * @author Zeno
 * @since Nov 29, 2014
 * @version 1.0
 * 
 * 
 * @see Executable
 * @see Messenger
 */
public class LoaderAction implements Executable, Messenger
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
	
	private Consumer<String> output;
	
	/**
	 * Creates a new {@code LoaderAction}.
	 * 
	 * @param task  a task to use
	 * 
	 * 
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
	 * 
	 * 
	 * @see Runnable
	 */
	public void setTask(Runnable task)
	{
		loader = new Thread(task);
		state = State.IDLE;
	}
	
	/**
	 * Changes the output of the {@code LoaderAction}.
	 * 
	 * @param output  a new output
	 * 
	 * 
	 * @see Consumer
	 * @see String
	 */
	public void setOutput(Consumer<String> output)
	{
		this.output = output;
	}
	
	/**
	 * An event raised when the task is finished.
	 */
	public void onFinished()
	{
		// NOT APPLICABLE
	}

	
	@Override
	public Consumer<String> Output()
	{
		return output;
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