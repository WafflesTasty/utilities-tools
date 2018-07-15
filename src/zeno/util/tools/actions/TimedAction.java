package zeno.util.tools.actions;

import zeno.util.tools.generic.manipulators.Executable;

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
	 * Changes the action's update interval.
	 * 
	 * @param ival  an update interval
	 */
	public void setInterval(long ival)
	{
		interval = ival;
	}
	
	/**
	 * An event raised when the timer ticks.
	 */
	public void onTick()
	{
		// NOT APPLICABLE
	}
}