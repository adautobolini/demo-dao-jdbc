package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAllWithOrder ===");
        List<Department> list = departmentDao.findAllWithOrder("Id");

        for(Department dep1 : list){
            System.out.println(dep1);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department dep2 = new Department(null,"Kitchen");
        departmentDao.insert(dep2);
        System.out.println("INSERTED!");

        System.out.println("\n=== TEST 4: department update ===");
        Department dep3 = departmentDao.findById(1);
        System.out.println(dep3);
        dep3.setName("Drivers");
        departmentDao.update(dep3);
        System.out.println("Updated!");
        dep3 = departmentDao.findById(1);
        System.out.println(dep3);

        System.out.println("\n=== TEST 5: department delete ===");
        dep3 = departmentDao.findById(6);
        System.out.println(dep3);
        departmentDao.deleteById(6);
        dep3 = departmentDao.findById(6);
        System.out.println(dep3);

    }
}
