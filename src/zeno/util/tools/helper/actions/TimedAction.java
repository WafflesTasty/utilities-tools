package zeno.util.tools.helper.actions;

import zeno.util.tools.patterns.manipulators.Executable;

/**
 * The {@code TimedAction} class defines an action that executes on set intervals.
 * <br> To change the logic executed on every tick, override the {@link #onTick()} event.
 *
 * @author Zeno
 * @since Dec 3, 2014
 * @version 1.0
 * 
 * 
 * @see Executable
 */
public class TimedAction implements Executable
{	
	private static final long DEF_UPDATE = 16;
	
	private enum State
	{
		STARTING,
		RUNNING;
	}
	
	
	private State state;
	private long current, last;
	private long delta, interval;
	private Executable task;
	
	/**
	 * Creates a new {@code TimedAction}.
	 * 
	 * @param ival  an update interval
	 */
	public TimedAction(long ival)
	{
		state = State.STARTING;
		interval = ival;
	}
	
	/**
	 * Creates a new {@code TimedAction}.
	 * <br> The default interval is 16ms.
	 */
	public TimedAction()
	{
		this(DEF_UPDATE);
	}

	
	@Override
	public void execute()
	{
		last = current;
		current = System.currentTimeMillis();
		delta = delta + (current - last);
		
		if(state == State.STARTING)
		{
			state = State.RUNNING;
			return;
		}
		
		if(delta >= interval)
		{
			delta = 0;
			onTick();
		}
	}
		
	/**
	 * Changes the task of the {@code TimedAction}.
	 * 
	 * @param task  a new task
	 * @see Executable
	 */
	public void setTask(Executable task)
	{
		this.task = task;
	}
	
	/**
	 * Changes the update period of the {@code TimedAction}.
	 * </ br> This value is measured in milliseconds.
	 * 
	 * @param ival  an update interval
	 */
	public void setPeriod(long ival)
	{
		interval = ival;
	}
	
	/**
	 * An event raised when the {@code TimedAction} ticks.
	 */
	public void onTick()
	{
		if(task != null)
		{
			task.execute();
		}
	}
}