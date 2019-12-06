package com.example.getthecar;

public class Car
{
    private  int carNo;
    private String carName;
    private  String carImage;
    private double rentRate;
    private boolean availability;
    private  double currentMilage;

    public Car(int carNo,String carName, String carImage,double rentRate,boolean availability,double currentMilage)
    {
        this.carNo = carNo;
        this.carName = carName;
        this.carImage = carImage;
        this.rentRate = rentRate;
        this.availability = availability;
        this.currentMilage = currentMilage;
    }
    public int getCarNo(){return carNo;}
    public String getCarName(){return carName;}
    public String getCarImage(){return carImage;}
    public double getRentRate(){return rentRate;}
    public double getCurrentMilage(){return currentMilage;}

    public void setAvailability(boolean availability){this.availability = availability;}
}
