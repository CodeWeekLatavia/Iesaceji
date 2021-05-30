package com.example.workio.service;

import com.example.workio.domain.Worker;
import com.example.workio.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepo;
    public List<Worker> listAllWorkers(){
        return workerRepo.findAll();
    }
    public void save(Worker worker){
        workerRepo.save(worker);
    }
    public Worker getByID(long ID){
        return workerRepo.findById(ID).get();
    }
    public void deleteByID(long ID){
        workerRepo.deleteById(ID);
    }
}
