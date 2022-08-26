package Collection;
import java.util.HashSet;
import java.util.Objects;

class Product {
	 private String products;
	
	    
	    public Product(String products) {
		super();
		this.products = products;
	}


		@Override
	public String toString() {
		return "Product [products=" + products + "]";
	}


		public String getProducts() {
		return products;
	}


	public void setProducts(String products) {
		this.products = products;
	}


		public static void main(String[] args)
	    {
	        // Creating a HashSet object of string type
	        HashSet<Product> hset = new HashSet<Product>();
	  Product p1=new Product("tide");
	  Product p2=new Product("surfexer");
	  Product p3=new Product("tide");//duplicate
	  Product p4=new Product("vanish");
	  Product p5=new Product("comfort");
	  Product p6=new Product("rain");
	  Product p7=new Product("comfort");//duplicate
	  Product p8=new Product("ujala");
	  Product p9=new Product("yui");
	  Product p10=new Product("ghjk");
	  
	  hset.add(p1);  
	    hset.add(p2);  
	    hset.add(p3);
	    hset.add(p4);
	    hset.add(p5);
	    hset.add(p6);
	    hset.add(p7);
	    hset.add(p8);
	    hset.add(p9);
	    hset.add(p10);
	    
	   for(Product p:hset){  
	       System.out.println(p.products);
	    }
	//System.out.println(hset);
	    }


		@Override
		public int hashCode() {
			return Objects.hash(products);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(products, other.products);
		}
}

