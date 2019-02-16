package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;


public class Program {

	public static void main(String[] args) {


		SellerDao sd = DaoFactory.createSellerDao();
		Seller s1 = sd.findById(3);
		System.out.println(s1);

	}

}
