package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	/*@Test
	public void testCRUDProduct() {

		// create operation
		product = new Product();

		product.setName("Shampoo Fresh");
		product.setBrand("oriflame");
		product.setDescription("This is some description for Shampoo Fresh product");
		product.setUnitPrice(650);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(3);

		assertEquals("Something went wrong while inserting a new product", true, productDAO.add(product));

		// reading and update the product
		product = productDAO.get(2);
		product.setName("Lip Bam Mango");
		assertEquals("Something whent wrong while updating the exisiting record!", true, productDAO.update(product));

		assertEquals("Something whent wrong while deleting the exisiting record!", true, productDAO.delete(product));

		// list
		assertEquals("Something whent wrong while fetching the list of products!", 6, productDAO.list().size());

	}*/

	
	  @Test public void testListActiveProducts() {
	  assertEquals("Somthing went wrong while fetching the list of products!",
	  8,productDAO.listActiveProducts().size()); }
	  
	  
	  @Test public void testListActiveProductsByCategory() {
	  assertEquals("Somthing went wrong while fetching the list of products!",
	  4,productDAO.listActiveProductsByCategory(1).size());
	  assertEquals("Somthing went wrong while fetching the list of products!",
	  2,productDAO.listActiveProductsByCategory(2).size()); 
	  assertEquals("Somthing went wrong while fetching the list of products!",
	  2,productDAO.listActiveProductsByCategory(3).size()); }
	  
	  
	  @Test public void testGetLatestActiveProduct() {
	  assertEquals("Somthing went wrong while fetching the list of products!",
	  1,productDAO.getLatestActiveProducts(165).size()); }
	 

}
