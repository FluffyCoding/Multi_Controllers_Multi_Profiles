package com.unity.angularapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PassengerController {

    @Value("${spring.profiles.active}")
    private String message;

    @Autowired
    PassengerService passengerService;

    @GetMapping(path = "/prod")
    public String msg() {
        return "Active Profile is " + message;
    }

    @GetMapping(path = "/api")
    public List<Passengers> fetchPassenger() {
        return passengerService.loadPassengers();
    }

}
