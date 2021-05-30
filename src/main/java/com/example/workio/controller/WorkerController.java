package com.example.workio.controller;

import com.example.workio.domain.Worker;
import com.example.workio.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WorkerController {

    @Autowired
    private WorkerService service;
    @GetMapping("/")
    public String viewLanding(Model model){
        List<Worker> workerList = service.listAllWorkers();
        model.addAttribute("workerList", workerList);
        System.out.println("Get / ");
        return "index";
    }
    @GetMapping("/add")
    public String addWorker(Model model){
        model.addAttribute("worker", new Worker());
        System.out.println("Add worker");
        return "redirect:/add.html";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateWorkers(@ModelAttribute("worker") Worker worker){
        service.save(worker);
        return "redirect:/";
    }
    @RequestMapping("/edit/{ID}")
    public ModelAndView workerEditPage(@PathVariable(name="ID") int ID){
        ModelAndView mv = new ModelAndView("new");
        Worker worker = service.getByID(ID);
        mv.addObject("worker", worker);
        return mv;
    }
    @RequestMapping("/delete/{ID}")
    public String deleteWorker(@PathVariable(name="ID") int ID){
        service.deleteByID(ID);
        return "redirect:/";
    }


}
