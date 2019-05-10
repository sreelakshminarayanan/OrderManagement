package com.sree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class OrderManagerTest {

    @Test
    public void shouldReturnValidOrderSize() {

        User user = new User("Sree", "60042");
        User Seconduser = new User("Jan", "60041");
        System.out.println(user.toString());
        Food food = new Food("abc", 20, 3);
        System.out.println(food.toString());
        List<Food> foodList = new ArrayList<>();
        foodList.add(food);
        System.out.println(foodList);
        OrderManager orderManager = new OrderManager();
        Order order = orderManager.placeOrder(foodList, user);
        assertEquals(42, order.getDeliveryCharges());
        Order seconOrder = orderManager.placeOrder(foodList, user);
        assertEquals(43, seconOrder.getDeliveryCharges());

        System.out.println("Delivery Charge of second order" + seconOrder.getDeliveryCharges());

        Order thirdOrder = orderManager.placeOrder(foodList, Seconduser);
        assertEquals(42, thirdOrder.getDeliveryCharges());

        System.out.println("Delivery Charge of second order" + thirdOrder.getDeliveryCharges());


        Order fourthOrder = orderManager.placeOrder(foodList, user);
        System.out.println("Delivery Charge of Fourth order" + fourthOrder.getDeliveryCharges());
        assertEquals(44, fourthOrder.getDeliveryCharges());
    }

}