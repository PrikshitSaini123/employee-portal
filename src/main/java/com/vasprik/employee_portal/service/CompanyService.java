package com.vasprik.employee_portal.service;

import com.vasprik.employee_portal.entity.Company;
import com.vasprik.employee_portal.repo.CompanyRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CompanyService {

    private final CompanyRepo companyRepo;

    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public List<Company> getCompanyList() {
        return companyRepo.findAll();
    }

    public String addCompany(Company company) {
        return companyRepo.save(company).getName() + "company is added successfully!";
    }

    public String updateCompany(Company company) {
        return companyRepo.save(company).getName() + "company is updated successfully!";
    }
}
