package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1,"Books");
		System.out.println(department);
		
		Seller seller = new Seller(1, "Moises", "moises.matana@gmail.com", new Date(), 800.00, department);
		System.out.println(seller);
	}
}
