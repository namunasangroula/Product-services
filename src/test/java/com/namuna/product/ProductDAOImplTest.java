package com.namuna.product;

import static org.junit.Assert.*;

import org.junit.Test;

import com.namuna.product.dao.ProductDAO;
import com.namuna.product.dao.ProductDAOImpl;
import com.namuna.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {

		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("It's Awesome!!");
		product.setPrice(800);

		dao.create(product);
		Product reasult = dao.read(1);
		
      assertNotNull(reasult);
      assertEquals("Iphone",reasult.getName());
	}

}
