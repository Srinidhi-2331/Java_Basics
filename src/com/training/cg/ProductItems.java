package com.training.cg;

public class ProductItems {

	public static void main(String[] args) {
		product prod1=new product();
		product prod2=new product();
		product prod3=new product();
		product prod4=new product();
		product prod5=new product();
		
		prod1.setProdId("101");
		prod2.setProdId("102");
		prod3.setProdId("103");
		prod4.setProdId("104");
		prod5.setProdId("105");
		
		prod1.setProdName("Cadbury");
		prod2.setProdName("Nestle");
		prod3.setProdName("Fabello");
		prod4.setProdName("Hershey's");
		prod5.setProdName("Parle");
		
		prod1.setProdDesc("Cadbury's Chocolate");
		prod2.setProdDesc("Nestle chocolate");
		prod3.setProdDesc("Fabello chocolate");
		prod4.setProdDesc("Hershey's chocolate");
		prod5.setProdDesc("Parle's chocolate");
		
		prod1.setPrice(10);
		prod2.setPrice(600);
		prod3.setPrice(400);
		prod4.setPrice(350);
		
		prod5.setPrice(500);
		System.out.println("Costlier Product Details are: "); 
		if(prod1.getPrice()>prod2.getPrice())
		{
		System.out.println("Product Id : "+prod1.getProdId());   
		System.out.println("Product Name:"+prod1.getProdName());
		System.out.println("Product Desc:"+prod1.getProdDesc());
		System.out.println("Product Price:"+prod1.getPrice());
		}
		else if (prod2.getPrice()>prod3.getPrice())
		{
			System.out.println("Product Id : "+prod2.getProdId());   
			System.out.println("Product Name:"+prod2.getProdName());
			System.out.println("Product Desc:"+prod2.getProdDesc());
			System.out.println("Product Price:"+prod2.getPrice());
		}
		else if (prod3.getPrice()>prod4.getPrice())
		{
			System.out.println("Product Id : "+prod3.getProdId());   
			System.out.println("Product Name:"+prod3.getProdName());
			System.out.println("Product Desc:"+prod3.getProdDesc());
			System.out.println("Product Price:"+prod3.getPrice());
		}
		else if (prod4.getPrice()>prod5.getPrice())
		{
			System.out.println("Product Id : "+prod4.getProdId());   
			System.out.println("Product Name:"+prod4.getProdName());
			System.out.println("Product Desc:"+prod4.getProdDesc());
			System.out.println("Product Price:"+prod4.getPrice());
		}
		else
		{
			System.out.println("Product Id : "+prod5.getProdId());   
			System.out.println("Product Name:"+prod5.getProdName());
			System.out.println("Product Desc:"+prod5.getProdDesc());
			System.out.println("Product Price:"+prod5.getPrice());
		}
			
		
		
		
		// TODO Auto-generated method stub

	}

}
