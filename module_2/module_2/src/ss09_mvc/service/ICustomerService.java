package ss09_mvc.service;

import ss09_mvc.model.Customer;

public interface ICustomerService {
    void display();

    void display1();
    Customer findById1(int id);
    void add1();
    void edit();
}
