package ss09_mvc.service;

import ss09_mvc.model.Customer;

public interface ICustomerService {
    void display();

    Customer findById1(int id);
    void add();
//    void edit();
}
