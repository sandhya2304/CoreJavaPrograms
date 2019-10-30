package Tuesday4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProductLmabda {

	public static void main(String[] args) 
	{
		List<Product> pp = new ArrayList<Product>();
		pp.add(new Product(1,"sandhya",123.1f));
		pp.add(new Product(2,"andhya",23f));
		pp.add(new Product(3,"dhya",12.1f));
		pp.add(new Product(4,"ya",3.1f));
		
		
		System.out.println("sorting basis of name:");
		
		Collections.sort(pp,(a,b)->{
			return a.getName().compareTo(b.getName());
		});
		
		Stream<Product> filter_data = pp.stream().filter(p -> p.getPrice() >23);
		
		filter_data.forEach(ppp ->System.out.println(ppp.getName()+" "+ppp.getPrice()));
		
		System.out.println("-------------");
		
		for(Product p:pp)
		{
			System.out.println(p);
		}
	}

}
