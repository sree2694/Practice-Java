package ExceptionHandling;

public class Product {
	private int id;
	private double weight;
	private double price;
	public static int idgenerator = 100;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(double weight, double price) {
		super();
		this.id = ++idgenerator;
		this.weight = weight;
		this.price = price;
		
	}

	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]\n";
	}

}
