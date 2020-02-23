package zeno.util.tools.helper.tasks;

/**
 * The {@code FPSAction} class keeps track of the FPS over discrete intervals.
 *
 * @author Zeno
 * @since Jan 31, 2020
 * @version 1.1
 * 
 * 
 * @see DeltaAction
 */
public class FPSAction extends DeltaAction
{
	private long fps;
	
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
		fps = (delta != 0 ? 1000 / delta : 0);
	}
}