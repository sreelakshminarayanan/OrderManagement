package com.sree;

import java.util.Date;
import java.util.List;

public class Order {

    private static int id;
    private List<Food> foodList;
    private User user;
    private int deliveryCharges;
    private int totalCharges;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;
    private status orderStatus;

    public Order() {

        System.out.println(this.date);
    }

    public Order(User user, List<Food> foodList) {
        id ++;
        this.date = new Date();
        this.user = user;
        this.foodList = foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public void Order(User user, List<Food> foodList) {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void process() {
        orderStatus = com.sree.status.COMPLETED;
    }

    public int getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(int deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    @Override
    public String toString() {
        return "Order{" +
                "foodList=" + foodList +
                ", user=" + user +
                ", deliveryCharges=" + deliveryCharges +
                ", totalCharges=" + totalCharges +
                ", date=" + date +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
