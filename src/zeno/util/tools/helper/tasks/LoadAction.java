package zeno.util.tools.helper.tasks;

import java.util.function.Consumer;

import zeno.util.tools.helper.Action;
import zeno.util.tools.patterns.properties.Messenger;

/**
 * The {@code LoadAction} class defines a task used to perform actions in a separate thread.
 * </br> To add additional logic after the task completes, override the {@link #onFinished()} event.
 * 
 * @author Zeno
 * @since Nov 29, 2014
 * @version 1.1
 * 
 * 
 * @see Messenger
 * @see Action
 */
public class LoadAction implements Action, Messenger
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
	 * Creates a new {@code LoadAction}.
	 * 
	 * @param task  a task to use
	 * 
	 * 
	 * @see Runnable
	 */
	public LoadAction(Runnable task)
	{
		setTask(task);
	}
	
	/**
	 * Creates a new {@code LoadAction}.
	 */
	public LoadAction()
	{
		this(null);
	}
		
	
	/**
	 * Starts the {@code LoadAction}.
	 */
	public void start()
	{
		state = State.BOOTING;
	}
	
	/**
	 * Changes the task of the {@code LoadAction}.
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
	public void onUpdate()
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