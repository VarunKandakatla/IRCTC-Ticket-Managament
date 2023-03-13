package com.example.IRCTC;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@org.springframework.stereotype.Repository


public class Repository {

    Map<String, Passenger> passengerMap = new HashMap<>();
    Map<String, Train> trainMap=new HashMap<>();
    Map<String, String> passengerTrainMap=new HashMap<>();

    Map<String, List<FoodOrder>> trainFoodOrders=new HashMap<>();

    public void addPassenger(String tickedId, String trainId, String Date, int age, String gender) {
        Passenger passenger = new Passenger(tickedId, trainId, Date, age, gender);
        passengerMap.put(tickedId, passenger);
        passengerTrainMap.put(tickedId,trainId);
    }

    public void addTrain(String Trainno, String source, String destination)
    {
        Train train=new Train(Trainno,source,destination);
        trainFoodOrders.put(Trainno,new ArrayList<>());
        trainMap.put(Trainno,train);
    }

    public int findNumberofPassengers(String source, String destination, String Date)
    {
        int count=0;
        for(String tcktId : passengerTrainMap.keySet())
        {
            Train train=trainMap.get(passengerTrainMap.get(tcktId));
            Passenger passenger=passengerMap.get(tcktId);

            if(train.getSource().equals(source) && train.getDestination().equals(destination) && passenger.getDate().equals(Date)){
                count++;
            }
        }
        return count;
    }
    //    Find total No of female passengers of age between X and Y(X < = Y)
//    who ended their destination at city C.
    public int totalFemalePassengers(int age1, int age2, String destination){

        int count=0;

        for(String tktId : passengerMap.keySet())
        {
            Passenger passenger=passengerMap.get(tktId);
            String trainId=passenger.getTrainId();
            Train train=trainMap.get(trainId);

            if(passenger.getAge()> age1 && passenger.getAge()<=age2 && train.getDestination().equals(destination)
             && passenger.getGender().equals("female"))
            {
                count++;
            }
        }

        return count;
    }

    public String maxOrders(String Date)
    {
        String trainId=null;
        int max=0;
        for(String str : trainFoodOrders.keySet())
        {
            if(max<trainFoodOrders.get(str).size())
            {
                max=trainFoodOrders.get(str).size();
                trainId=str;
            }
        }

        return trainId;
    }
}
