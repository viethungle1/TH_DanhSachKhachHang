package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @GetMapping("/customer")
    public String showList(Model model) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Hung","hung@gmail.com","Ha Noi"));
        list.add(new Customer(2,"Hai","hai@gmail.com","Ha Noi"));
        list.add(new Customer(3,"Loc","loc@gmail.com","Ha Noi"));
        list.add(new Customer(4,"Tuan Anh","ta@gmail.com","Ha Noi"));
        list.add(new Customer(5,"Thang","thang@gmail.com","Ha Noi"));
        model.addAttribute("customer",list);
        return "list";
    }
    @GetMapping("/customer1")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Hung","hung@gmail.com","Ha Noi"));
        list.add(new Customer(2,"Hai","hai@gmail.com","Ha Noi"));
        list.add(new Customer(3,"Loc","loc@gmail.com","Ha Noi"));
        list.add(new Customer(4,"Tuan Anh","ta@gmail.com","Ha Noi"));
        list.add(new Customer(5,"Thang","thang@gmail.com","Ha Noi"));
        modelAndView.addObject("customer",list);
        return modelAndView;
    }
    @GetMapping("/customer2")
    public String showList(HttpServletRequest request) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"Hung","hung@gmail.com","Ha Noi"));
        list.add(new Customer(2,"Hai","hai@gmail.com","Ha Noi"));
        list.add(new Customer(3,"Loc","loc@gmail.com","Ha Noi"));
        list.add(new Customer(4,"Tuan Anh","ta@gmail.com","Ha Noi"));
        list.add(new Customer(5,"Thang","thang@gmail.com","Ha Noi"));
        request.setAttribute("customer",list);
        return "list";
    }
}
