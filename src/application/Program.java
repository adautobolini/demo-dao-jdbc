package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(1,"Suporte");

        System.out.println(department);

        Seller seller = new Seller(21, "Jose", "jose@gmail.com", LocalDate.now(), 2000.0, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
