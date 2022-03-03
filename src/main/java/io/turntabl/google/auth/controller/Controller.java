package io.turntabl.google.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String homePage(){
        return "<h2>Welcome to the home page of the desk booking system </h2> <a href='http://localhost:8083/login'> Sign in with Google</a>";
    }

    @GetMapping("/login")
    public String restrictedPage(){
        return "<h2>Booking Page</h2> <a href='http://localhost:8083/booking'> Sign in with Google</a>";
    }


    @GetMapping("/booking")
    public String bookingPage(){
        return "<h2 style='color: red'>Welcome to the Booking Page</h2> <a href='http://localhost:8083/logout'> Sign out</a>";
    }


    @GetMapping("/logout")
    public String logoutPage(){
        return "<a href='http://localhost:8083/logout'> Logout/a>";
    }


}
