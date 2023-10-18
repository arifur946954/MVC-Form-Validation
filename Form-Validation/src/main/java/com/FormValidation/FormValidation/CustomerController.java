package com.FormValidation.FormValidation;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/showForm")
    public String showForm(Model theModel){
        Customer theCustomer=new Customer();
        theModel.addAttribute("customer",theCustomer);
        return "customer-form";

    }
    @PostMapping("/processForm")
    public  String processForm(
            @Valid @ModelAttribute("customer") Customer  theCustomer,
            BindingResult theBindindResult){
        if(theBindindResult.hasErrors()){
            return "customer-form";
        }else {
            return "customer-confirmition";
        }

    }






}
