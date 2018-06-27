package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.GymInstructors;
import pl.coderslab.repository.GymInstructorsRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(path = "/gyminstructors")
public class GymInstructorsController {

    @Autowired
    GymInstructorsRepository gymInstructorsRepository;

    @GetMapping(path ="/add")
    public String giSave(@RequestParam(required = false) Long id, Model model){
        GymInstructors gymInstructors = id == null ? new GymInstructors() : gymInstructorsRepository.findGymInstructorsById(id);
        model.addAttribute("gymInstructors", gymInstructors);
        return "gymInstructors/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid GymInstructors gymInstructors, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "gymInstructors/add";
        }

        if (gymInstructors.getId() == null) {
            gymInstructorsRepository.save(gymInstructors);
        } else {
            gymInstructorsRepository.save(gymInstructors);
        }
        return "redirect:all";
    }

    @ModelAttribute("gymInstructorss")
    public List<GymInstructors> getGI() {
        return gymInstructorsRepository.findAll();
    }



    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "gymInstructors/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGI(@RequestParam Long id) {
        gymInstructorsRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listGI() {
        return "gymInstructors/list";
    }

}
