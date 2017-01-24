package shoes;

public class Shoe {

  public String make, model;
  public int[] sizes;
  public double rating;

  public Shoe(final String make,
              final String model,
              final int[] sizes,
              final double rating)
              {
                this.make = make;
                this.model = model;
                this.sizes = sizes;
                this.rating = rating;
              }

  }
