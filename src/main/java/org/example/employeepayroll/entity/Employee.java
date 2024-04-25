package org.example.employeepayroll.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int salary;

    @Column
    private LocalDate startdate;

    @Column
    private String gender;

    @Column
    private String profilepicture;

    @Column
    private String notes;

    @Column
    private String department; // Corrected spelling: "designation"

    // Constructors
    public Employee() {}

    public Employee(int id, String name, int salary, LocalDate startdate, String gender, String profilepicture, String notes, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startdate = startdate;
        this.gender = gender;
        this.profilepicture = profilepicture;
        this.notes = notes;
        this.department = department;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(String profilepicture) {
        this.profilepicture = profilepicture;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startdate=" + startdate +
                ", gender='" + gender + '\'' +
                ", profilepicture='" + profilepicture + '\'' +
                ", notes='" + notes + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
