package zeno.util.tools;

import java.util.List;
import java.util.Random;

/**
* The {@code Randomizer} class provides a static random number generator.
* <br> It contains all basic functionalities for random generation.
* 
* @author Zeno
* @since Nov 14, 2014
* @version 1.0
*/
public final class Randomizer
{
	private static long seed;
	private static Random rng;
	
	/**
	 * Returns the initial seed.
	 * 
	 * @return  the randomizer's seed
	 */
	public static long getSeed()
	{
		return seed;
	}
	
	/**
	 * Initializes the {@code Randomizer}.
	 */
	public static void initialize()
	{
		setSeed(System.nanoTime());
	}
	
	/**
	 * Initializes the {@code Randomizer}.
	 * 
	 * @param value  a seed to initialize with
	 */
	public static void initialize(long value)
	{
		setSeed(value);
	}
	
	
	/**
	 * Generates a random double using gaussian distribution.
	 * 
	 * @param mean  the distribution's mean
	 * @param max  the distribution's estimated maximum
	 * @return  a random gaussian-distributed double
	 */
	public static double randomGaussian(double mean, double max)
	{
		double random;
		do
		{
			random = rng.nextGaussian() * (max - mean) / 3 + mean;
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
	public static double randomDouble(double min, double max)
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
	public static float randomFloat(float min, float max)
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
	public static long randomLong(long min, long max)
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
	public static int randomInt(int min, int max)
	{
		return rng.nextInt(max - min) + min;
	}
	
	
	/**
	 * Generates a random index from a list of weighted values.
	 * 
	 * @param weights  a list of weight values
	 * @return  a weighted random index
	 */
	public static int randomIndex(List<Float> weights)
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
	public static <T> T randomItem(List<T> objects)
	{
		return objects.get(rng.nextInt(objects.size()));
	}
	
	/**
	 * Generates a random item from an array of objects.
	 * 
	 * @param objects  an array to select from
	 * @return  a random array object
	 */
	public static <T> T randomItem(T[] objects)
	{
		return objects[rng.nextInt(objects.length)];
	}
	
	
	/**
	 * Generates a random boolean, {@code true} or {@code false}.
	 * 
	 * @return  a random boolean
	 */
	public static boolean randomBoolean()
	{
		return rng.nextBoolean();
	}
	
	/**
	 * Generates a random double using gaussian distribution.
	 * The distribution uses mean is 0.0 and deviation = 1.0.
	 * 
	 * @return  a random gaussian-distributed double
	 */
	public static double randomGaussian()
	{
		return rng.nextGaussian();
	}
		
	/**
	 * Generates a random double between 0.0 and 1.0.
	 * 
	 * @return  a random double
	 */
	public static double randomDouble()
	{
		return rng.nextDouble();
	}
	
	/**
	 * Generates a random float between 0f and 1f.
	 * 
	 * @return  a random float
	 */
	public static float randomFloat()
	{
		return rng.nextFloat();
	}
	
	/**
	 * Generates a random long between -2<sup>63
	 * </sup> and 2<sup>63</sup> - 1.
	 * 
	 * @return  a random long
	 */
	public static long randomLong()
	{
		return rng.nextLong();
	}
	
	/**
	 * Generates a random int between -2<sup>31
	 * </sup> and 2<sup>31</sup> - 1.
	 * 
	 * @return  a random integer
	 */
	public static int randomInt()
	{
		return rng.nextInt();
	}
	
	
	private static void setSeed(long value)
	{
		rng = new Random(value);
		seed = value;
	}
	
	private Randomizer()
	{
		// NOT APPLICABLE
	}
}