package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.FitnessInstructors;
import pl.coderslab.entity.FitnessPayroll;
import pl.coderslab.entity.GymInstructors;
import pl.coderslab.entity.GymPayroll;
import pl.coderslab.repository.FitnessInstructorsRepository;
import pl.coderslab.repository.FitnessPayrollRepository;
import pl.coderslab.repository.GymInstructorsRepository;
import pl.coderslab.repository.GymPayrollRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/fitnesspayroll")
public class FitnessPayrollController {

    @Autowired
    FitnessPayrollRepository fitnessPayrollRepository;

    @Autowired
    FitnessInstructorsRepository fitnessInstructorsRepository;



    @GetMapping(path = "/add")
    public String gymSave(@RequestParam(required = false) Long id, Model model) {
        FitnessPayroll fitnessPayroll = id == null ? new FitnessPayroll() : fitnessPayrollRepository.findFitnessPayrollById(id);
        model.addAttribute("fitnessPayroll", fitnessPayroll);
        return "fitnessPayroll/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid FitnessPayroll fitnessPayroll, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "fitnessPayroll/add";
        }

        if (fitnessPayroll.getId() == null) {
            fitnessPayrollRepository.save(fitnessPayroll);
        } else {
            fitnessPayrollRepository.save(fitnessPayroll);
        }
        return "redirect:all";
    }

    @ModelAttribute("fitnessPayrolls")
    public List<FitnessPayroll> getGyms() {
        return fitnessPayrollRepository.findAll();
    }


    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "fitnessPayroll/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGym(@RequestParam Long id) {
        fitnessPayrollRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listGyms() {
        return "fitnessPayroll/list";
    }

    @ModelAttribute("fitnessInstructors")
    public List<FitnessInstructors> getGI() {
        return fitnessInstructorsRepository.findAll();
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
