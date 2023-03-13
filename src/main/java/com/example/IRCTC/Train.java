package com.example.IRCTC;

public class Train {

    private String TrainNo;
    private String source;
    private String Destination;

    public Train(String trainNo, String source, String destination) {
        TrainNo = trainNo;
        this.source = source;
        Destination = destination;
    }

    public String getTrainNo() {
        return TrainNo;
    }

    public void setTrainNo(String trainNo) {
        TrainNo = trainNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
}
