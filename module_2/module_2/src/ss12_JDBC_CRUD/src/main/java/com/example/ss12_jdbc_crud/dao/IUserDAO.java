package com.example.ss12_jdbc_crud.dao;


import com.example.ss12_jdbc_crud.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
    public List<User> findCountry(String country);

    public List<User> SortByName();
}
