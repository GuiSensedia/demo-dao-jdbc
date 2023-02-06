package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n=== TEST 1: seller - findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		System.out.println("=== TEST 2: seller - findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(seller);
		}
		System.out.println();
		System.out.println("=== TEST 3: seller - findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(seller);
		}
	}

}
