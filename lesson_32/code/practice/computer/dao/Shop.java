package practice.computer.dao;

import practice.computer.model.Computer;

public interface Shop {
    boolean addComputer(Computer computer);
    Computer removeComputer(String serialnumber);
    Computer findComputer(String serialnumber);
    int quantity();
    void printComputer();
}
