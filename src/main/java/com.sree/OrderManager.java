package com.sree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderManager {

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    private List<Order> orderList ;

    public OrderManager() {
        orderList =new ArrayList<Order>();
    }
    public Order placeOrder(List<Food> foodList, User user) {
        Order order = new Order(user, foodList);
        order.process();

        order.setDeliveryCharges(42 +  (computerDeliveryCharges(order)));
        orderList.add(order);
        return order;
    }

    private int computerDeliveryCharges(Order order) {
        int orderCountsWithinZipCode =0;
        for(Order ord: orderList) {
            // Yet to implement date comparision logic
            long diff = ord.getDate().getTime() - order.getDate().getTime();//as given

            long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diff);
            System.out.println("Minutes " + diffInMinutes);
            if (ord.getUser().getZipCode() == order.getUser().getZipCode() && (diffInMinutes < 30  )) {
                orderCountsWithinZipCode ++;
            }
        }
        System.out.println("Counter is " + orderCountsWithinZipCode);
        return orderCountsWithinZipCode;
    }
}
