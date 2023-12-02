package com.project.helloworldjavafx.model.dao;

import com.project.helloworldjavafx.db.DB;
import com.project.helloworldjavafx.model.dao.impl.DepartmentDaoJDBC;
import com.project.helloworldjavafx.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}