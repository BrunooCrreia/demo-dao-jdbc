package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// Department obj = new Department(1, "books");
		// Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.00,
		// obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("===Teste 1: seller findById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("===Teste 2: seller findByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

		}
		System.out.println("===Teste 3: seller findAll ======");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);

		}

		System.out.println("===Teste 4: seller Insert ======");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("inserted! new id = " + newSeller.getId());
		
		System.out.println("===Teste 5: seller Update ======");
		seller = sellerDao.findById(1);
		sellerDao.update(seller);
		System.out.println("update completed");

	}
}
