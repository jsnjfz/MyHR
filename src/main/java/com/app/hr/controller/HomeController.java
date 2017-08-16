package com.app.hr.controller;

import com.app.hr.dao.EmployeeDao;
import com.app.hr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @Author fz
 * @Date 2017-08-16 15:58
 */

@Controller
public class HomeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/getEmployees")
    @ResponseBody
    public DataTablesOutput<Employee> getEmployees(@Valid DataTablesInput input) {
        DataTablesOutput<Employee> test =employeeDao.findAll(input);
        return test;
    }

}
