package de.telran;

import java.util.*;

public class OrderService {

    /**
     *
     * @param orders a list of order
     * @param delta time interval in millis
     * @return the number of orders from the ssome restaurant for every order  for the previous delta millis befor the order.
     */
    public Map<String, Integer> countPreviousOrders(List<Order> orders, long delta) {
        List<Order> ordersCopy = new ArrayList<>(orders);
        ordersCopy.sort(Comparator.comparingLong(Order::getTimestamp));

//Mapping from restaurants to the deqque  of the timestamps of the orders commandated into the last delta milliseconds
        Map<String, Deque<Long>> orderTimesByRestaurantId = new HashMap<>();

        //Mapping orderId to the number  of previous orders of the some resturants with delta milliseconds
        Map<String,Integer>res =new HashMap<>();

        for (Order order : ordersCopy) {
            Deque<Long> previousTimeStamps = orderTimesByRestaurantId.get(order.getRestaurantId());
            if (previousTimeStamps == null) {
                previousTimeStamps = new ArrayDeque<>();
                orderTimesByRestaurantId.put(order.getRestaurantId(), previousTimeStamps);
            }
            Long currentTimestamp = order.getTimestamp();
            previousTimeStamps.addLast(currentTimestamp);
            while (currentTimestamp - previousTimeStamps.getFirst() > delta)
                previousTimeStamps.removeFirst();


        }
    }
}
