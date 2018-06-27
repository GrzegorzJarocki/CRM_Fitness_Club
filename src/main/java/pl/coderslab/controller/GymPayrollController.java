package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Client;
import pl.coderslab.entity.Gym;
import pl.coderslab.entity.GymInstructors;
import pl.coderslab.entity.GymPayroll;
import pl.coderslab.repository.ClientRepository;
import pl.coderslab.repository.GymInstructorsRepository;
import pl.coderslab.repository.GymPayrollRepository;
import pl.coderslab.repository.GymRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/gympayroll")
public class GymPayrollController {

    @Autowired
    GymPayrollRepository gymPayrollRepository;

    @Autowired
    GymInstructorsRepository gymInstructorsRepository;



    @GetMapping(path = "/add")
    public String gymSave(@RequestParam(required = false) Long id, Model model) {
        GymPayroll gymPayroll = id == null ? new GymPayroll() : gymPayrollRepository.findGymPayrollById(id);
        model.addAttribute("gymPayroll", gymPayroll);
        return "gymPayroll/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid GymPayroll gymPayroll, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "gymPayroll/add";
        }

        if (gymPayroll.getId() == null) {
            gymPayrollRepository.save(gymPayroll);
        } else {
            gymPayrollRepository.save(gymPayroll);
        }
        return "redirect:all";
    }

    @ModelAttribute("gymPayrolls")
    public List<GymPayroll> getGyms() {
        return gymPayrollRepository.findAll();
    }


    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "gymPayroll/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGym(@RequestParam Long id) {
        gymPayrollRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listGyms() {
        return "gymPayroll/list";
    }

    @ModelAttribute("gymInstructors")
    public List<GymInstructors> getGI() {
        return gymInstructorsRepository.findAll();
    }

    @ModelAttribute("months")
    public List<String> getMonths() {
        List<String> list = new ArrayList<String>();
        list.add("06-2018");
        list.add("07-2018");
        list.add("08-2018");
        return list;
    }








}
