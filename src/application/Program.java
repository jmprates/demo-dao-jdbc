package application;

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

	}

}
