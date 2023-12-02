package com.project.helloworldjavafx.model.services;

import com.project.helloworldjavafx.model.dao.DaoFactory;
import com.project.helloworldjavafx.model.dao.DepartmentDao;
import com.project.helloworldjavafx.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return departmentDao.findAll();
    }
}
