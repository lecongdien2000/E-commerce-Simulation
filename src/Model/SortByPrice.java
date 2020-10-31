package Model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements Sort {

	@Override
	public void sortDecrease(List<Product> products) {
		// TODO Auto-generated method stub
		Comparator<Product> price = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice() > o2.getPrice()) return -1;
				if (o1.getPrice() == o2.getPrice()) return 0;
				return 1;
			}
		};
		Collections.sort(products, price);

	}

	@Override
	public void sortIncrease(List<Product> products) {
		// TODO Auto-generated method stub
		Comparator<Product> price = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice() > o2.getPrice()) return 1;
				if (o1.getPrice() == o2.getPrice()) return 0;
				return -1;
			}
		};
		Collections.sort(products, price);
	}

}
