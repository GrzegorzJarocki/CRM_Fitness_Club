package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.repository.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {



    @Autowired
    GymInstructorsRepository gymInstructorsRepository;

    @Autowired
    FitnessInstructorsRepository fitnessInstructorsRepository;

    @Autowired
    GymRepository gymRepository;

    @Autowired
    FitnessRepository fitnessRepository;

    @RequestMapping(path ="/")
    public String home(){
        return "index";

    }

    @RequestMapping(path ="/test")
    public String homee(){
        return "reports/test3";

    }

    @GetMapping(path = "/reports")

    public String report() {

    return "reports/reports";

    }
    @GetMapping(path = {"/reportsgympayroll","/reportsfitnesspayroll","/reportsallpayroll"})

    public String ureport() {

        return "reports/payroll";

    }
    @PostMapping(path ="/reportsgympayroll" )

    public String gpreport(@RequestParam Long id) {

        return "redirect:/reports/"+id+"/gympayroll";

    }

    @PostMapping(path ="/reportsfitnesspayroll" )

    public String fpreport(@RequestParam Long id) {

        return "redirect:/reports/"+id+"/fitnesspayroll";

    }

    @PostMapping(path ="/reportsallpayroll" )

    public String apreport(@RequestParam Long id) {

        return "redirect:/reports/"+id+"/allpayrolls";

    }

    @GetMapping(path = {"/reportgymincome","/reportfitnessincome","/reportallincome","/reportprofit"})

    public String incometeport() {

        return "reports/income";

    }

    @PostMapping(path = {"/reportgymincome"})

    public String gincometeport(@RequestParam String date1) {
        String date2="";
        if (date1.equals("2018-07-01")){
            date2="2018-07-31"; }
        else if (date1.equals("2018-06-01")){
            date2="2018-06-30"; }
        else if (date1.equals("2018-08-01")){
            date2="2018-08-31"; }
        return "redirect:/reports/"+date1+"/"+date2+"/gympasses";

    }

    @PostMapping(path = {"/reportfitnessincome"})

    public String fincometeport(@RequestParam String date1) {
        String date2="";
        if (date1.equals("2018-07-01")){
            date2="2018-07-31"; }
        else if (date1.equals("2018-06-01")){
            date2="2018-06-30"; }
        else if (date1.equals("2018-08-01")){
            date2="2018-08-31"; }
        return "redirect:/reports/"+date1+"/"+date2+"/fitnesspasses";

    }

    @PostMapping(path = {"/reportprofit"})

    public String profitincometeport(@RequestParam String date1) {
        String date2="";
        Long id=0L;
        if (date1.equals("2018-07-01")){
            date2="2018-07-31"; id=2L; }
        else if (date1.equals("2018-06-01")){
            date2="2018-06-30"; id=1L;}
        else if (date1.equals("2018-08-01")){
            date2="2018-08-31"; id=3L; }
        return "redirect:/reports/"+id+"/"+date1+"/"+date2+"/money";

    }

    @PostMapping(path = {"/reportallincome"})

    public String allincometeport(@RequestParam String date1) {
        String date2="";
        if (date1.equals("2018-07-01")){
            date2="2018-07-31"; }
        else if (date1.equals("2018-06-01")){
            date2="2018-06-30"; }
        else if (date1.equals("2018-08-01")){
            date2="2018-08-31"; }
        return "redirect:/reports/"+date1+"/"+date2+"/allpasses";

    }
    @GetMapping(path = {"/reportgymgrowth", "reportfitnessgrowth", "reportallgrowth"})

    public String greport() {

        return "reports/growth";

    }
    @PostMapping(path = {"/reportgymgrowth"})

    public String growthgreport(@RequestParam String date1) {
        String date2="";
        String date3="";
        String date4="";

        if (date1.equals("2018-07-01")){
            date2="2018-07-31";
        date3="2018-06-01";
         date4=   "2018-06-30";}

        else if (date1.equals("2018-08-01")){
            date2="2018-08-31";
            date3="2018-07-01";
            date4=   "2018-07-31";}
        return "redirect:/reports/"+date3+"/"+date4+"/"+date1+"/"+date2+"/countgym";

    }
    @PostMapping(path = {"/reportfitnessgrowth"})

    public String growthfreport(@RequestParam String date1) {
        String date2="";
        String date3="";
        String date4="";

        if (date1.equals("2018-07-01")){
            date2="2018-07-31";
            date3="2018-06-01";
            date4=   "2018-06-30";}

        else if (date1.equals("2018-08-01")){
            date2="2018-08-31";
            date3="2018-07-01";
            date4=   "2018-07-31";}
        return "redirect:/reports/"+date3+"/"+date4+"/"+date1+"/"+date2+"/countfitness";

    }

    @PostMapping(path = {"/reportallgrowth"})

    public String growthallreport(@RequestParam String date1) {
        String date2="";
        String date3="";
        String date4="";

        if (date1.equals("2018-07-01")){
            date2="2018-07-31";
            date3="2018-06-01";
            date4=   "2018-06-30";}

        else if (date1.equals("2018-08-01")){
            date2="2018-08-31";
            date3="2018-07-01";
            date4=   "2018-07-31";}
        return "redirect:/reports/"+date3+"/"+date4+"/"+date1+"/"+date2+"/countall";

    }

    @GetMapping(path = "/reports/{id}/gympayroll" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String gymPayrollreport(@PathVariable Long id) {

        double b = gymInstructorsRepository.findPayrollByMonth(id);
        int d = (int)b;
        return "<h2>Płace wszystkich instruktorów siłowni w danym miesiącu to: " + d +"zł</h2>";
    }

    @GetMapping(path = "/reports/{id}/fitnesspayroll" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String fitnessPayrollreport(@PathVariable Long id) {

        double b = fitnessInstructorsRepository.findPayrollByMonth(id);
        int d = (int)b;
        return "<h2>Płace wszystkich instruktorów fitness w danym miesiącu to: " + d +"zł</h2>";
    }
    @GetMapping(path = "/reports/{id}/allpayrolls" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String allPayrollreport(@PathVariable Long id) {

        double a = gymInstructorsRepository.findPayrollByMonth(id);
        double b = fitnessInstructorsRepository.findPayrollByMonth(id);
        double c = a+b;
        int d = (int)c;
        return "<h2>Płace wszystkich instruktorów w klubie w danym miesiącu to: " + d +"zł</h2>";
    }
    @GetMapping(path = "/reports/{date1}/{date2}/gympasses" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String gymPassesreport(@PathVariable String date1, @PathVariable String date2) {

        double b = gymRepository.findSumAllGymPasses(date1, date2);
        int d = (int)b;
        return "<h2>Przychody z karnetów na siłownie w danym miesiącu to: " + d +"zł</h2>";
    }

    @GetMapping(path = "/reports/{date1}/{date2}/fitnesspasses" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String fitnessPassesreport(@PathVariable String date1, @PathVariable String date2) {

        double b = fitnessRepository.findSumAllFitnessPasses(date1, date2);
        int d = (int)b;
        return "<h2>Przychody z karnetów na fitness w danym miesiącu to: " + d +"zł</h2>";
    }


    @GetMapping(path = "/reports/{date1}/{date2}/allpasses" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String allPassesreport(@PathVariable String date1, @PathVariable String date2) {

        double a= gymRepository.findSumAllGymPasses(date1, date2);
        double b = fitnessRepository.findSumAllFitnessPasses(date1, date2);
        double c = a+b;
        int d = (int)c;
        return "<h2>Przychody z karnetów na siłownie i fitness w danym miesiącu to: " + d +"zł</h2>";
    }
    @GetMapping(path = "/reports/{id}/{date1}/{date2}/money" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String allMoney(@PathVariable Long id, @PathVariable String date1, @PathVariable String date2) {

        double a = gymInstructorsRepository.findPayrollByMonth(id);
        double b = fitnessInstructorsRepository.findPayrollByMonth(id);
        double c =gymRepository.findSumAllGymPasses(date1, date2);
        double d = fitnessRepository.findSumAllFitnessPasses(date1, date2);

        double e = c+d-a-b;

        int f = (int)e;
        return "<h2>Zysk/Strata  w klubie w danym miesiącu to: " + f +"zł</h2>";
    }
    @GetMapping(path = "/reports/{date1}/{date2}/{date3}/{date4}/countgym" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String countAllGPassesreport(@PathVariable String date1, @PathVariable String date2,@PathVariable String date3, @PathVariable String date4) {
    String s="";
        double a = gymRepository.findCountAllGymPasses(date1, date2);
        double b = gymRepository.findCountAllGymPasses(date3, date4);
        double c = b-a;
        double f;
        double g;
        if(c==0){
            s="Liczba klientów nie zmieniła się";}
        else if (c>0){f=(c/a)*100;
            System.out.println(f);
            g = Math.round(f*100.0)/100.0;
            s="liczba klientów wzrosła o " +g+ "%";}
        else if (c<0){f=(c/a)*(-100);
            System.out.println(a);
            System.out.println(f);
            g = Math.round(f*100.0)/100.0;
            s="liczba klientów spadła o " +g+ "%";}

        String z = String.valueOf(a + b);
        return "<h2>"+s+"</h2>";
        }
    @GetMapping(path = "/reports/{date1}/{date2}/{date3}/{date4}/countfitness" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String countAllFPassesreport(@PathVariable String date1, @PathVariable String date2,@PathVariable String date3, @PathVariable String date4) {
        String s="";
        double a = fitnessRepository.findCountAllFitnessPasses(date1, date2);
        double b = fitnessRepository.findCountAllFitnessPasses(date3, date4);
        double c = b-a;
        double f;
        double g;
        if(c==0){
            s="Liczba klientów nie zmieniła się";}
        else if (c>0){f=(c/a)*100;
            System.out.println(f);
            g = Math.round(f*100.0)/100.0;
            s="liczba klientów wzrosła o " +g+ "%";}
        else if (c<0){f=(c/a)*(-100);
            System.out.println(a);
            System.out.println(f);
            g = Math.round(f*100.0)/100.0;
            s="liczba klientów spadła o " +g+ "%";}


        return "<h2>"+s+"</h2>";
    }

    @GetMapping(path = "/reports/{date1}/{date2}/{date3}/{date4}/countall" , produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String countAllaPassesreport(@PathVariable String date1, @PathVariable String date2,@PathVariable String date3, @PathVariable String date4) {
        String s="";
        double a = gymRepository.findCountAllGymPasses(date1, date2);
        double b = gymRepository.findCountAllGymPasses(date3, date4);
        double c = fitnessRepository.findCountAllFitnessPasses(date1, date2);
        double d= fitnessRepository.findCountAllFitnessPasses(date3, date4);
        double e=(b+d)-(a+c);
        double f;
        double g;
        if(e==0){
            s="Liczba klientów nie zmieniła się";}
        else if (e>0){f=(e/(a+c))*100;
            System.out.println(f);
            g = Math.round(f*100.0)/100.0;
            s="liczba klientów wzrosła o " +g+ "%";}
        else if (e<0){f=(e/(a+c))*(-100);
            System.out.println(a);
            System.out.println(f);
             g = Math.round(f*100.0)/100.0;
            s="liczba klientów spadła o " +g+ "%";}


        return "<h2>"+s+"</h2>";
    }








}
