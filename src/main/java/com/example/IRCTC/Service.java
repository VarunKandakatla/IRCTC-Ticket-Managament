package com.example.IRCTC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
//     Add a Passenger with ticketId , trainId ,Date,age,gender
    public void addPassenger(String tickedId,String trainId, String Date, int age, String gender )
    {
        repository.addPassenger(tickedId,trainId,Date, age,gender);
    }

    public void addTrain(String Trainno, String source, String destination)
    {
        repository.addTrain(Trainno,source,destination);
    }
}
