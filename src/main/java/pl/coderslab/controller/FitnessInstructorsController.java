package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.FitnessInstructors;
import pl.coderslab.entity.GymInstructors;
import pl.coderslab.repository.FitnessInstructorsRepository;
import pl.coderslab.repository.GymInstructorsRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/fitnessinstructors")
public class FitnessInstructorsController {


    @Autowired
    FitnessInstructorsRepository fitnessInstructorsRepository;

    @GetMapping(path ="/add")
    public String giSave(@RequestParam(required = false) Long id, Model model){
       FitnessInstructors fitnessInstructors = id == null ? new FitnessInstructors() : fitnessInstructorsRepository.findFitnessInstructorsById(id);
        model.addAttribute("fitnessInstructors", fitnessInstructors);
        return "fitnessInstructors/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid FitnessInstructors fitnessInstructors, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "fitnessInstructors/add";
        }

        double salary = fitnessInstructors.getSalaryPerHour()*fitnessInstructors.getHours();

        fitnessInstructors.setSalary(salary);

        if (fitnessInstructors.getId() == null) {
            fitnessInstructorsRepository.save(fitnessInstructors);
        } else {
            fitnessInstructorsRepository.save(fitnessInstructors);
        }
        return "redirect:all";
    }

    @ModelAttribute("fitnessInstructorss")
    public List<FitnessInstructors> getGI() {
        return fitnessInstructorsRepository.findAll();
    }



    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "fitnessInstructors/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGI(@RequestParam Long id) {
        fitnessInstructorsRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listGI() {
        return "fitnessInstructors/list";
    }

    @ModelAttribute("hours")
    public List<Integer> getHours() {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<21; i++){
            list.add(i);

        }
        return list;
    }




}
