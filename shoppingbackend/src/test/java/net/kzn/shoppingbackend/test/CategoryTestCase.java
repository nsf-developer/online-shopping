package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Perfume");
	 * category.setDescription("This is some description for Perfume! ");
	 * category.setImageURL("CAR_5.png");
	 * 
	 * assertEquals("Successfully added a category inside the table",true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully fetched a single category","Creams",category.
	 * getName());
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * category.setName("Perfume");
	 * 
	 * assertEquals("Successfully Updated a single category",true,categoryDAO.update
	 * (category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully Deleted a single category",true,categoryDAO.delete
	 * (category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully fetched a list of category",1,categoryDAO.list().
	 * size());
	 * 
	 * }
	 */

	@Test
	public void testCategory() {

		category = new Category();

		category.setName("Creams");
		category.setDescription("This is some description for Creams! ");
		category.setImageURL("CAR_5.png");

		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Perfume");
		category.setDescription("This is some description for Perfume! ");
		category.setImageURL("CAR_5.png");

		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));

		// fetching and update the category
		category = categoryDAO.get(2);

		category.setName("Perfume");

		assertEquals("Successfully Updated a single category", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully Deleted a single category", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched a list of category", 1, categoryDAO.list().size());
		
	}

}
