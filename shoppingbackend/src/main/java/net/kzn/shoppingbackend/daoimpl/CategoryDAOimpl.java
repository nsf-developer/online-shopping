package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Creams");
		category.setDescription("This is some description for Creams! ");
		category.setImageURL("CAR_1.png");

		categories.add(category);

		// adding second category
		category = new Category();
		category.setId(2);
		category.setName("Lipstick");
		category.setDescription("This is some description for Lipstick! ");
		category.setImageURL("");

		categories.add(category);

		// adding third category
		category = new Category();
		category.setId(3);
		category.setName("Perfume");
		category.setDescription("This is some description for Perfume! ");
		category.setImageURL("CAR_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
			
		return null;
	}

}
