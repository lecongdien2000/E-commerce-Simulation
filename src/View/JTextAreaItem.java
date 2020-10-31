package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JTextArea;

import Model.Bill;
import Model.Product;
//Class for show information
public class JTextAreaItem extends JTextArea{
	
	public void deleteItem(String id) {
		String text = this.getText();
		int begin = text.indexOf(id);
		String tmp = text.substring(begin, text.length());
		int end = tmp.indexOf("\n");
		this.setText(text.substring(0, begin) + tmp.substring(end + 1, tmp.length()));
	}

	public void addItem(List<String> item) {
		String result = "";
		for(int i = 0; i < item.size(); i++) {
			if(i==0)
				result = result + item.get(i);
			else 
				result = result + "\t" + item.get(i);
		}
		result = result + "\n";
		this.setText(this.getText() + result);	
	}

	public void reDrawWithProductType(Map<Product, Integer> productsMap) {
		this.setText("");
		if(productsMap==null) return;
		for(Product product: productsMap.keySet()) {
			List<String> item = new ArrayList<String>();
			item.add(product.getId());
			item.add(product.getName());
			item.add(product.getPrice()+"");
			item.add(product.getQty()+"");
			addItem(item);
		}
		
	}
	
	public void reDrawWithBillsType(List<Bill> billList) {
		this.setText("");
		for(Bill bill: billList) {
			drawBill(bill);
		}
	}

	public void drawBill(Bill bill) {
		List<String> item = new ArrayList<String>();
		for(Product product: bill.getProducts().keySet()) {
			item = new ArrayList<String>();
			item.add(bill.getId());
			item.add(product.getName());
			item.add(bill.getProducts().get(product)+"");
			item.add(bill.getTotalPriceEachProduct(product)+"");
			item.add(bill.getStateString());
			item.add(bill.getPhaseString());
			this.addItem(item);
		}
	}

	
	
	

}
