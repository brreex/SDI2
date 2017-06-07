package cs544.sdi2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		IProductService productService =(ProductService) context.getBean("productService");
		
		Product product1 = productService.getProduct(423);
		if (product1 != null) {
			System.out.println(product1.toString());
		}
		Product product2 = productService.getProduct(239);
		if (product2 != null) {
			System.out.println(product2.toString());
		}
		
		System.out.println("we have "+productService.getNumberInStock(423)+" product(s) with product number 423");
		System.out.println("we have "+productService.getNumberInStock(239)+" product(s) with produxt number 239");
		
		context.close();

	}
}
