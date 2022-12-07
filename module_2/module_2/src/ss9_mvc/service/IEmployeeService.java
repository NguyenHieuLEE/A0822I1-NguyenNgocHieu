package ss9_mvc.service;

import ss9_mvc.model.Employee;

public interface IEmployeeService {
    void display();
    Employee findById(int id);
    void add();
    void delete();
    void update();
    void search();
}
