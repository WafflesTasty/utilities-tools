package zeno.util.tools.helper.actions.timed;

import zeno.util.tools.patterns.manipulators.Executable;

/**
 * The {@code DiscreteAction} class defines an action that executes on set intervals.
 * <br> To change the logic executed on every tick, override the {@link #onTick()} event.
 *
 * @author Zeno
 * @since Dec 3, 2014
 * @version 1.0
 * 
 * 
 * @see DeltaAction
 */
public class DiscreteAction extends DeltaAction
{	
	private static final long DEF_UPDATE = 16;
	
	
	private Executable task;
	private long accum, interval;
	
	/**
	 * Creates a new {@code DiscreteAction}.
	 * 
	 * @param ival  an update interval
	 */
	public DiscreteAction(long ival)
	{
		interval = ival;
	}
	
	/**
	 * Creates a new {@code DiscreteAction}.
	 * </br> The default interval is 16ms.
	 */
	public DiscreteAction()
	{
		this(DEF_UPDATE);
	}

	
	@Override
	public void onUpdate(long delta)
	{
		super.onUpdate(delta);
		accum += delta;
		if(accum >= interval)
		{
			accum %= interval;
			onTick();
		}
	}
	
	/**
	 * Changes the task of the {@code DiscreteAction}.
	 * 
	 * @param task  a new task
	 * 
	 * 
	 * @see Executable
	 */
	public void setTask(Executable task)
	{
		this.task = task;
	}
	
	/**
	 * Changes the update period of the {@code DiscreteAction}.
	 * </ br> This value is measured in milliseconds.
	 * 
	 * @param ival  an update interval
	 */
	public void setPeriod(long ival)
	{
		interval = ival;
	}
	
	/**
	 * An event raised when the {@code DiscreteAction} ticks.
	 */
	public void onTick()
	{
		if(task != null)
		{
			task.execute();
		}
	}
}