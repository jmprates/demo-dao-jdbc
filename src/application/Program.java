package application;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;


public class Program {

	public static void main(String[] args) {
		
		SellerDao sd = DaoFactory.createSellerDao();

		System.out.println("--------Test 1----------");
		Seller s1 = sd.findById(3);
		System.out.println(s1);
		
		System.out.println("--------Test 2----------");
		Department dp = new Department(2, null);
		List<Seller> list = sd.findByDepartment(dp);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("--------Test 3----------");
		List<Seller> list2 = sd.findAll();
		
		for (Seller obj : list2) {
			System.out.println(obj);
		}
		
		System.out.println("--------Test 4----------");
		Seller s = new Seller(null, "Toquinho Brasil", "tq@gmail.com", new Date(), 4000.00, dp);
		sd.insert(s);
		
		System.out.println("Inseridooo, ID: " + s.getId());
		
		
		

	}

}
