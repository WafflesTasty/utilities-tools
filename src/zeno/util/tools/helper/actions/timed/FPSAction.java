package zeno.util.tools.helper.actions.timed;

/**
 * The {@code FPSAction} class keeps track of the FPS over discrete intervals.
 *
 * @author Zeno
 * @since Jan 31, 2020
 * @version 1.0
 * 
 * 
 * @see DiscreteAction
 */
public class FPSAction extends DiscreteAction
{
	private long delta, fps;
	
	/**
	 * Creates a new {@code FPSAction}.
	 */
	public FPSAction()
	{
		super();
	}
	
	/**
	 * Creates a new {@code FPSAction}.
	 * 
	 * @param ival  an update interval
	 */
	public FPSAction(long ival)
	{
		super(ival);
	}
	
	/**
	 * Returns the current fps value.
	 * 
	 * @return  an fps value
	 */
	public long FPS()
	{
		return fps;
	}
	
	
	@Override
	public void onUpdate(long delta)
	{
		super.onUpdate(delta);
		this.delta = delta;
	}
	
	@Override
	public void onTick()
	{
		super.onTick(); fps = (delta != 0 ? 1000 / delta : 0);
	}
}