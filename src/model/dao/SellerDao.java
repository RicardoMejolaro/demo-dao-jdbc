package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void upadte(Seller obj);
	void delateById(Integer id);
	Seller findById(Integer id);
	List<Seller> finAll();

}
