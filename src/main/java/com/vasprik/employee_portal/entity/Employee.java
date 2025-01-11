package com.vasprik.employee_portal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    private String name;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "contact_number")
    private long contactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dob;

    @Column(name = "is_married")
    private boolean isMarried;

    private String gender;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;

    @ManyToOne
    @JoinColumn(name = "designation_id", nullable = false)
    private Designation designation;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;

    @Column(name = "is_permanent")
    private boolean isPermanent;

    @Column(name = "is_full_time")
    private boolean isFullTime;

    @Column(name = "is_working")
    private boolean isWorking;
}
