package com.app.hr.dao;

import com.app.hr.model.Employee;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author fz
 * @Date 2017-08-16 16:30
 */

@Transactional
public interface EmployeeDao extends DataTablesRepository<Employee, Long> {

}
