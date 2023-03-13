package com.example.IRCTC;

public class Passenger {
//    Passenger = TicketId ,TrainId ,Date.,Age,gender
    private String TicketId;
    private String TrainId;
    private String Date;
    private int Age;
    private String Gender;

    public Passenger(String ticketId, String trainId, String date, int age, String gender) {
        TicketId = ticketId;
        TrainId = trainId;
        Date = date;
        Age = age;
        Gender = gender;
    }

    public String getTicketId() {
        return TicketId;
    }

    public void setTicketId(String ticketId) {
        TicketId = ticketId;
    }

    public String getTrainId() {
        return TrainId;
    }

    public void setTrainId(String trainId) {
        TrainId = trainId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
