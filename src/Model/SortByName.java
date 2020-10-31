package Model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Sort {
	
	@Override
	public void sortDecrease(List<Product> products) {
		// TODO Auto-generated method stub
		
		Comparator<Product> name = new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return -o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(products, name);
	}

	@Override
	public void sortIncrease(List<Product> products) {
		// TODO Auto-generated method stub

		Comparator<Product> name = new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(products, name);
	}
	
}
