package Classes;
import Interfaces.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Rent implements RentPrice, Observable {
    private List<Observer> observers = new ArrayList<>();
    protected String brand;
    protected double price;
    protected boolean insurance;
    protected boolean inRent;
    protected boolean inStock;
    protected Customer customer;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isInStock() {
        return inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    protected boolean isInsured() {
        return insurance;
    }
    protected boolean isRented() {
        return inRent;
    }

    @Override
    public abstract double getPrice();
    @Override
    public abstract void setPrice(double price);
    @Override
    public void add(Observer o){
        observers.add(o);
    }
    @Override
    public void remove(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(){
        for (Observer o:
             observers) {
            o.update();
        }
    }
}
