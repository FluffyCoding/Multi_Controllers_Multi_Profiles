package com.unity.angularapi;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PassengerService {

    @PostConstruct
    public List<Passengers> loadPassengers() {
        return Arrays.asList(new Passengers(1, "Stephen", true, new Date("25/5/2021"),
                        Arrays.asList(new Children("Ted", 16), new Children("Chloe", 10))),
                new Passengers(2, "Rose", true, new Date("08/12/2012"),
                        Arrays.asList(new Children("Stephen", 13), new Children("Louise", 10))),
                new Passengers(3, "James", false, new Date("15/12/2012"),
                        Arrays.asList(new Children("Red", 10))),
                new Passengers(4, "Louise", true, new Date("12/12/2012"), null));
    }

}
