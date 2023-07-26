package waffles.utils.tools;

import java.util.List;
import java.util.Random;

/**
* The {@code Randomizer} class defines a random number generator as a wrapper for {@code java.util.Random}.
* A set of useful random generation methods is provided, along with static access to a global generator.
* 
* @author Waffles
* @since Nov 14, 2014
* @version 1.0
*/
public final class Randomizer
{
	private static Randomizer global;
	
	/**
	 * Returns the global {@code Randomizer}.
	 * 
	 * @return  a global randomizer
	 * 
	 * 
	 * @see Randomizer
	 */
	public static Randomizer Global()
	{
		return global;
	}
		
	/**
	 * Initializes the global {@code Randomizer}.
	 * 
	 * @param value  a random seed
	 */
	public static void initialize(long value)
	{
		global = new Randomizer(value);
	}
	
	/**
	 * Initializes the global {@code Randomizer}.
	 */
	public static void initialize()
	{
		global = new Randomizer();
	}
	
	
	private long seed;
	private Random rng;
	
	/**
	 * Creates a new {@code Randomizer}.
	 */
	public Randomizer()
	{
		this(System.nanoTime());
	}
	
	/**
	 * Creates a new {@code Randomizer}.
	 * 
	 * @param seed  a random seed
	 */
	public Randomizer(long seed)
	{
		setSeed(seed);
	}
	
	/**
	 * Returns the {@code Randomizer} generator.
	 * 
	 * @return  a random generator
	 * 
	 * 
	 * @see Random
	 */
	public Random Generator()
	{
		return rng;
	}
	
	/**
	 * Returns the {@code Randomizer} seed.
	 * 
	 * @return  an initial random seed
	 */
	public long Seed()
	{
		return seed;
	}
	
	
	/**
	 * Generates a random index from a list of weighted values.
	 * 
	 * @param weights  a list of weight values
	 * @return  a weighted random index
	 */
	public int randomIndex(List<Float> weights)
	{
		float[] cumulativelist = new float[weights.size()];
		
		for(int i = 0; i < weights.size(); i++)
		{
			if(i != 0)
				cumulativelist[i] = weights.get(i) + cumulativelist[i - 1];
			else
				cumulativelist[i] = weights.get(i);
		}
		
		// Takes into account a list of probabilities where the sum is not 1.
		float chance = rng.nextFloat() * cumulativelist[weights.size() - 1];
		
		for(int i = 0; i < weights.size(); i++)
		{
			if(chance < cumulativelist[i])
				return i;
		}
		
		return -1;
	}

	/**
	 * Generates a random item from a {@code List} of objects.
	 * 
	 * @param objects  a list to select from
	 * @return  a random list object
	 */
	public <T> T randomItem(List<T> objects)
	{
		return objects.get(rng.nextInt(objects.size()));
	}
	
	/**
	 * Generates a random item from an array of objects.
	 * 
	 * @param objects  an array to select from
	 * @return  a random array object
	 */
	public <T> T randomItem(T[] objects)
	{
		return objects[rng.nextInt(objects.length)];
	}
	
	
	/**
	 * Generates a random double using gaussian distribution.
	 * 
	 * @param mean  a distribution mean
	 * @param max   a distribution estimated maximum
	 * @return  a random gaussian-distributed double
	 */
	public double randomGaussian(double mean, double max)
	{
		double random;
		do
		{
			random = randomGaussian() * (max - mean) / 3 + mean;
		}
		while(max <= random && random <= -max);
		
		return random;
	}
	
	/**
	 * Generates a random double with a lower and upper bound.
	 * 
	 * @param min  the lower double limit
	 * @param max  the higher double limit
	 * @return  a random double between bounds
	 */
	public double randomDouble(double min, double max)
	{
		return randomDouble() * (max - min) + min;
	}
	
	/**
	 * Generates a random float with a lower and upper bound.
	 * 
	 * @param min  the lower float limit
	 * @param max  the higher float limit
	 * @return  a random float between bounds
	 */
	public float randomFloat(float min, float max)
	{
		return randomFloat() * (max - min) + min;
	}
		
	/**
	 * Generates a random long with a lower and upper bound.
	 * 
	 * @param min  the lower long limit
	 * @param max  the higher long limit
	 * @return  a random long between bounds
	 */
	public long randomLong(long min, long max)
	{
		return randomLong() * (max - min) + min;
	}
	
	/**
	 * Generates a random int with a lower and upper bound.
	 * 
	 * @param min  the lower integer limit
	 * @param max  the higher integer limit
	 * @return  a random integer between bounds
	 */
	public int randomInt(int min, int max)
	{
		return rng.nextInt(max - min) + min;
	}
		
	
	/**
	 * Generates a random boolean, {@code true} or {@code false}.
	 * 
	 * @return  a random boolean
	 */
	public boolean randomBoolean()
	{
		return rng.nextBoolean();
	}
	
	/**
	 * Generates a random double using gaussian distribution.
	 * The distribution uses mean is 0.0 and deviation = 1.0.
	 * 
	 * @return  a random gaussian-distributed double
	 */
	public double randomGaussian()
	{
		return rng.nextGaussian();
	}
		
	/**
	 * Generates a random double between 0.0 and 1.0.
	 * 
	 * @return  a random double
	 */
	public double randomDouble()
	{
		return rng.nextDouble();
	}
	
	/**
	 * Generates a random float between 0f and 1f.
	 * 
	 * @return  a random float
	 */
	public float randomFloat()
	{
		return rng.nextFloat();
	}
	
	/**
	 * Generates a random long between -2<sup>63
	 * </sup> and 2<sup>63</sup> - 1.
	 * 
	 * @return  a random long
	 */
	public long randomLong()
	{
		return rng.nextLong();
	}
	
	/**
	 * Generates a random int between -2<sup>31
	 * </sup> and 2<sup>31</sup> - 1.
	 * 
	 * @return  a random integer
	 */
	public int randomInt()
	{
		return rng.nextInt();
	}
	
	
	void setSeed(long value)
	{
		rng = new Random(value);
		seed = value;
	}
}