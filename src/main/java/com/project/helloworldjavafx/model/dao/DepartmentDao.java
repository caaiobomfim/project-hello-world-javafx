package com.project.helloworldjavafx.model.dao;

import java.util.List;

import com.project.helloworldjavafx.model.entities.Department;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}