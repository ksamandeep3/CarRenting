package com.example.getthecar;

import java.util.ArrayList;
import java.util.List;

public class Customer
{
    private  int id;
    private  String name;
    private int age;
    private int phone;
    private String address;
    private  String username;
    private  String password;
    private List<Integer> carNo = new ArrayList<>();

    public Customer(int id, String name,int age,int phone,String address,String username, String password)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;

    }
    public void addRentingHistory(int carNo)
    {
        this.carNo.add(carNo);
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getPhone(){return phone;}
    public String getAddress(){return address;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public List<Integer> getCarNo(){return carNo;}
}

