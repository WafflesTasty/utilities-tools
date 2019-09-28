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
	private P par;
	private boolean hasChanged;
	
	/**
	 * Creates a new {@code DirtyValue}.
	 * 
	 * @param p  an initial parameter 
	 */
	public DirtyValue(P p)
	{
		hasChanged = true;
		par = p;
	}
	
	/**
	 * Returns the parameter of the {@code DirtyValue}.
	 * 
	 * @return  a value parameter
	 */
	protected P Parameter()
	{
		return par;
	}
	
	/**
	 * Flags the {@code DirtyValue} to be updated.
	 */
	protected void setChanged()
	{
		hasChanged = true;
	}
	
	/**
	 * Updates the current state of the {@code DirtyValue}.
	 * </br> NOTE: This method should not be called directly.
	 * 
	 * @param p  an update parameter
	 */
	protected abstract void update(P p);
		
	/**
	 * Checks the cache of the {@code DirtyValue}.
	 * </br> The contents is updated whenever necessary.
	 * 
	 * @param p  an update parameter
	 */
	protected void checkCache(P p)
	{
		if(!p.equals(par))
		{
			setChanged();
			par = p;
		}
		
		if(hasChanged)
		{
			hasChanged = false;
			update(par);
		}
	}
}