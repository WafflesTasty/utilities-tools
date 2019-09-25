package zeno.util.tools.patterns;

/**
 * The {@code DirtyValue} class defines a value that caches its result.
 * <br> Flagging the value as dirty forces it to update on the next
 * call to the {@link #checkCache} method.
 * 
 * @author Zeno
 * @since Aug 8, 2015
 * @version 1.0
 * 
 * 
 * @param <P>  an update parameter
 */
public abstract class DirtyValue<P>
{	
	private boolean hasChanged;
	
	/**
	 * Creates a new {@code DirtyValue}.
	 */
	public DirtyValue()
	{
		hasChanged = true;
	}
	
	/**
	 * Flags the {@code DirtyValue} to be updated.
	 */
	protected void setChanged()
	{
		hasChanged = true;
	}
	
	/**
	 * Updates the {@code DirtyValue}'s cache.
	 * </br> NOTE: This method should not be called directly.
	 * 
	 * @param par  an update parameter
	 */
	protected abstract void update(P par);
		
	
	/**
	 * Indicates the {@code DirtyValue} is dirty.
	 * </br> NOTE: This method should not be called directly.
	 * 
	 * @param par  an update parameter
	 * @return  {@code true} if dirty
	 */
	protected boolean isDirty(P par)
	{
		return hasChanged;
	}

	/**
	 * Checks the cache of the {@code DirtyValue}.
	 * </br> The contents is updated whenever necessary.
	 * 
	 * @param par  an update parameter
	 */
	public void checkCache(P par)
	{
		if(isDirty(par))
		{
			hasChanged = false;
			update(par);
		}
	}
}