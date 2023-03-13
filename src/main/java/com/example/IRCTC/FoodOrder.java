package com.example.IRCTC;

public class FoodOrder {

//    FoodOrder = TicketId,TrainId ,price

    private String TicketId;
    private String TrainId;
    private int price;

    public FoodOrder(String ticketId, String trainId, int price) {
        TicketId = ticketId;
        TrainId = trainId;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
