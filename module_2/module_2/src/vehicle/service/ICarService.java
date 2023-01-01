package vehicle.service;

import vehicle.model.Car;

public interface ICarService {
    void display();
    Car findById(int id);
    void add();
    void delete();
    void update();
    void search();
}
