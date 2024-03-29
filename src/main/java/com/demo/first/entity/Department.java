package com.demo.first.entity;
//Entities are classes that depicts the tables that needs to be stored in the DB
// to enable the classes to interact with the DB using JPA we need to annotate the class using @Entity


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data //to enable lombok to create getters,setters,constructors on compilation itself hence we dont need to create them manually or have them in the class file
@NoArgsConstructor //to get default constructor only
@AllArgsConstructor //to get parameterized constructor with all properties
@Builder //creates object with any number of properties of the class unlike parameterized constructors of class
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //This enables the db to generate ids automatically
    private Long departmentId;

    @NotBlank(message = "Please add department name")
    @Length(max =5, min=1)
//    other validations
//    @Size(max=10, min=0)
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @PastOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

//    //default constructor
//
//
//    public Department() {
//    }
//
//    //parameterized constructor
//    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//
//    //to generate getters & setters in intellij idea, alt+(fn+insert)key ,
//    // fn+insert key again to come out of insert mode(cursor changes back from bold to normal
//    public Long getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(Long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
//
//    //toString method
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                '}';
//    }

}
