package zeno.util.tools.patterns;

/**
 * The {@code DirtyValue} class defines a value that caches its result.
 * <br> Flagging the value as dirty forces it to update on the next
 * call to the {@link #checkCache} method.
 * 
 * @author Zeno
 * @since Aug 8, 2015
 */
public abstract class DirtyValue
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
	 * <br> NOTE: This method should not be called directly.
	 */
	protected abstract void update();
		
	
	/**
	 * Indicates the {@code DirtyValue} is dirty.
	 * 
	 * @return  {@code true} if dirty
	 */
	public boolean isDirty()
	{
		return hasChanged;
	}

	/**
	 * Checks the cache of the {@code DirtyValue}.
	 * <br> The contents is updated whenever necessary.
	 */
	public void checkCache()
	{
		if(isDirty())
		{
			hasChanged = false;
			update();
		}
	}
}