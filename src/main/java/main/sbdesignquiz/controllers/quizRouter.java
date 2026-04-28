package main.sbdesignquiz.controllers;

import main.sbdesignquiz.models.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class quizRouter {

    static List<Order> Orders = new ArrayList<Order>();

    @GetMapping("/quiz/orders")
    public ResponseEntity<Order[]> getOrders(){
        return ResponseEntity.ok(Orders.toArray(new Order[0]));
    }

    @PostMapping("/quiz/result")
    public String handlePost(@RequestBody Order order) {
        return "OK";

    }
}
