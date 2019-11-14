package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDpartmentDao();
		
		System.out.println("Teste 1: department findById ----------");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
		
		System.out.println("Teste 2: department findByAll ----------");

		Department dep = new Department(2, null);
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			
			System.out.println(obj);
		}
		
		System.out.println();

		System.out.println("Teste 3:  Insert department ----------");
		
		Department newDepartment = new Department(null, "Finance");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted new id: " + newDepartment.getId());
		
		System.out.println();

		System.out.println("Teste 4: Update department ----------");
		
		department = departmentDao.findById(1);
		department.setName("Martha Waine");
		departmentDao.update(department);
		System.out.println("Update complete!");
		
		System.out.println();

		System.out.println("Teste 5:  Delete Department ----------");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		sc.close();
		
	}

}
