package org.example.Service.IService;

import org.example.ENTYTI.Computer;
import org.example.ENTYTI.Status;

import java.util.List;

public interface IComputerService {
    List<Computer> getAllComputer();
    public boolean createNewComputer(Computer computer);
    Computer getComputerByIdComputer(String idComputer);
    void changeStatus(String idComputer, Status status);
}
