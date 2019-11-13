package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller seller);
	void upadte(Seller seller);
	void delateById(Integer id);
	Seller findById(Integer id);
	List<Seller> finAll();
	List<Seller> findByDepartment(Department department);

}
