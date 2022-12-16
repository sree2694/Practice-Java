package ExceptionHandling;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Movie.Movie;

public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> product = new LinkedList<Product>();
		product.add(new Product(250, 1200));
		product.add(new Product(50, 800));
		product.add(new Product(300, 2000));
		product.add(new Product(150, 900));
		product.add(new Product(200, 1500));
		product.add(new Product(40, 200));
		product.add(new Product(230, 1300));
		product.add(new Product(200, 1600));
		product.add(new Product(40, 200));
		product.add(new Product(230, 1400));
		System.out.println(product);

		Iterator<Product> itr = product.iterator();
		while (itr.hasNext()) {
			Product b = itr.next();
			try {
				ValidateProduct(b);
			} catch (Exception e) {
				System.out.println(e);
				itr.remove();
			}

		}

		for (Product b : product)
			System.out.println(b);
	}

	public static void ValidateProduct(Product b) throws WeightException {
		// TODO Auto-generated method stub
		if (b.getWeight() < 200)
			throw new WeightException("Weight Invalid: " + b.getId());

	}

}
