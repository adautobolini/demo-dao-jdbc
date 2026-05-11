package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Double salary;

    private Department department;

    public Seller(){
    }

    public Seller(Integer id, String name, String email, LocalDate birthDate, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.salary = salary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public Seller setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Seller setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Seller setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Seller setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Seller setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Seller setDepartment(Department department) {
        this.department = department;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
