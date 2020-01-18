/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Client.Client;
import Cars.*;

import config.DBConnection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mustapha Abdelaziz
 */
@Controller
public class HelloController {

    JdbcTemplate jdbcTemplate = new JdbcTemplate(DBConnection.conecter());
    ModelAndView modelAndView = new ModelAndView();
    int id;

    @RequestMapping(value = "SignIn", method = RequestMethod.GET)
    public ModelAndView login() {
        modelAndView.addObject(new Client());
        modelAndView.setViewName("SignIn");
        return modelAndView;
    }
    
    @RequestMapping(value = "SignIn", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (Boolean.parseBoolean(request.getParameter("admin"))) {
            modelAndView.addObject("admin", "admin");
            modelAndView.setViewName("index");
            return new ModelAndView("redirect:/index.htm");
        }else{
        modelAndView.addObject(new Client());
        modelAndView.setViewName("SignIn");
        return modelAndView;
        }
       
    }
    

    @RequestMapping(value = "SignUp", method = RequestMethod.GET)
    public ModelAndView register() {
        modelAndView.addObject(new Client());
        modelAndView.setViewName("SignUp");
        return modelAndView;
    }

 //get the cars into the index.jsp
    //this methods is called whenever we go to the index.jsp page
    @RequestMapping("index.htm")
    public ModelAndView getCars() {
        List list = CarsTable.select();
        modelAndView.addObject("lista", list);
        modelAndView.setViewName("index");
        return modelAndView;
    }
     @RequestMapping("indexClient.htm")
    public ModelAndView getCarstoClient() {
        List list = CarsTable.select();
        modelAndView.addObject("lista", list);
        modelAndView.setViewName("indexClient");
        return modelAndView;
    }

    @RequestMapping(value = "Reservation", method = RequestMethod.GET)
    public ModelAndView reservation() {
        modelAndView.addObject(new Client());
        modelAndView.setViewName("Reservation");
        return modelAndView;
    }

    @RequestMapping(value = "addCar.htm", method = RequestMethod.GET)
    public ModelAndView addCar() {
        modelAndView.addObject(new Car());
        modelAndView.setViewName("addCar");
        return modelAndView;
    }

    @RequestMapping(value = "addCar.htm", method = RequestMethod.POST)
    public ModelAndView addCar(Car car) {
        CarsTable.insert(car);
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "UpdateCar.htm", method = RequestMethod.GET)
    public ModelAndView updateCar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        List list = CarsTable.select(id);
        modelAndView.addObject("lista", list);
        modelAndView.setViewName("UpdateCar");
        return modelAndView;
    }
    @RequestMapping(value = "UpdateCar.htm", method = RequestMethod.POST)
    public ModelAndView updateCar(Car car) {
        CarsTable.update(car,id);
        return new ModelAndView("redirect:/index.htm");
    }
    @RequestMapping("DeleteCar.htm")
    public ModelAndView deletCar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        CarsTable.delete(id);
        return new ModelAndView("redirect:/index.htm");
    }

}
