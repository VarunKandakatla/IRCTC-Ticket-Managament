package com.example.IRCTC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Service service;

//     Add a Passenger with ticketId , trainId ,Date,age,gender
    @PostMapping("/addPassenger")
    public ResponseEntity addPassenger(@RequestBody String ticketId, String trainId, String Date, int age, String gender)
    {
        service.addPassenger(ticketId,trainId,Date,age,gender);
        return new ResponseEntity<>("Passenger Added", HttpStatus.CREATED);
    }
//Add a Train with trainNo , source ,destination .
    @PostMapping("/addTrain")
    public ResponseEntity addTrain( @RequestBody String Trainno, String source, String destination)
    {
        service.addTrain(Trainno,source,destination);
        return new ResponseEntity("Train Added", HttpStatus.CREATED);
    }

//    Find the Number of passengers traveling from City X and City Y on Date D
    @GetMapping("/findNumberofPassengers")
    public int findNumberofPassengers(@RequestParam ("Q") String source, String destination, String Date)
    {
        return service.repository.findNumberofPassengers( source, destination, Date);
    }

    @GetMapping("/totalFemalePassengers")
    public int totalFemalePassengers(@RequestParam("D") int age1, int age2, String destination)
    {
        return service.repository.totalFemalePassengers(age1,age2,destination);
    }

//    Get the TrainId which received the maximum number of orders on Date D
    @GetMapping("/maxOrders")
    public ResponseEntity maxOrders(String Date )
    {

        return new ResponseEntity<>(service.repository.maxOrders(Date),HttpStatus.CREATED);
    }



}
