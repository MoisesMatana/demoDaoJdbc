package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=====Teste I - Seller findById=====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=====Teste II - Seller findByDepartment=====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=====Teste III - Seller findAll=====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=====Teste IV - Seller insert=====");
		Seller newSeller = new Seller(null, "Rocco", "rocco@gmail.com", new Date(), 1000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo ID = " + newSeller.getId());
	}
}
