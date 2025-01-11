package com.vasprik.employee_portal.controller;

import com.vasprik.employee_portal.entity.Company;
import com.vasprik.employee_portal.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companyList")
    public ResponseEntity<List<Company>> getCompanyList() {
        return new ResponseEntity<>(companyService.getCompanyList(), HttpStatus.OK);
    }

    @PostMapping(value = "/addCompany")
    public ResponseEntity<String> addCompany(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.addCompany(company), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateCompany(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.updateCompany(company), HttpStatus.OK);
    }
}
