package application;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {
		
		DepartmentDao dd = DaoFactory.createDepartmentDao();
//		SellerDao sd = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("--------Test 1----------");
//		Seller s1 = sd.findById(3);
//		System.out.println(s1);
//		
//		System.out.println("--------Test 2----------");
//		Department dp = new Department(2, null);
//		List<Seller> list = sd.findByDepartment(dp);
//		
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("--------Test 3----------");
//		List<Seller> list2 = sd.findAll();
//		
//		for (Seller obj : list2) {
//			System.out.println(obj);
//		}
		
//		System.out.println("--------Test 4----------");
//		Seller s = new Seller(null, "Toquinho Brasil", "tq@gmail.com", new Date(), 4000.00, dp);
//		sd.insert(s);
//		
//		System.out.println("Inseridooo, ID: " + s.getId());
		
		
//		System.out.println("--------Test 5----------");
//		s1 = sd.findById(1);
//		s1.setName("Bob Brown");
//		sd.update(s1);
//		
//		System.out.println("Atualizado ID: " + s1.getId());
		
		
//		System.out.println("--------Test 6----------");
//		System.out.println("Insira o id a ser deletado: ");
//		int id = sc.nextInt();
//		sd.deleteById(id);
//		System.out.println("Deletado ID: " + id);
//		
//		sc.close();
		
//		System.out.println("--------Test 7----------");
//		Department d = new Department(null, "Musical");
//		dd.insert(d);
//		System.out.println("Inseridooo, ID: " + d.getId());
		
//		System.out.println("--------Test 9----------");
//		Department d1 = dd.findById(2);
//		System.out.println(d1);
		
//		System.out.println("--------Test 8----------");
//		Department d1 = dd.findById(6);
//		d1.setName("DVDs");
//		dd.update(d1);
//		System.out.println("Atualizado ID: " + d1.getId());
		
//		System.out.println("--------Test 10----------");
//		System.out.println("Insira o id a ser deletado: ");
//		int id = sc.nextInt();
//		dd.deleteById(id);
//		System.out.println("Deletado ID: " + id);
//		sc.close();
//		
//		System.out.println("--------Test 11----------");
//		List<Department> list2 = dd.findAll();
//		
//		for (Department obj : list2) {
//			System.out.println(obj);
//		}
		
		
	}

}
