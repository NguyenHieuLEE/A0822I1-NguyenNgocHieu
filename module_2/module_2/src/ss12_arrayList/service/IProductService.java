package ss12_arrayList.service;

import ss12_arrayList.model.Product;

public interface IProductService {
    void display();
    Product findById(int id);
    void add();
    void delete();
    void update();
    void search(String name);
}
