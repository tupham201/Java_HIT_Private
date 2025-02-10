package org.example.Service;

import org.example.ENTYTI.Computer;
import org.example.ENTYTI.Status;
import org.example.Service.IService.IComputerService;

import java.util.ArrayList;
import java.util.List;

public class ComputerService implements IComputerService {
    private List<Computer> computers = new ArrayList<>();
    @Override
    public List<Computer> getAllComputer() {
        return computers;
    }

    @Override
    public boolean createNewComputer(Computer computer) {
        for(Computer com : computers){
            if(com.getIdComputer().equals(computer.getIdComputer())){
                return true;
            }
        }
        computers.add(computer);
        return false;
    }

    @Override
    public Computer getComputerByIdComputer(String idComputer) {
        for(Computer com : computers){
            if(com.getIdComputer().equals(idComputer)){
                return com;
            }
        }
        return null;
    }

    @Override
    public void changeStatus(String idComputer, Status status) {

    }

}
