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
        System.out.println("=== Получен POST-запрос ===");
        System.out.println("Имя: " + order.getName());
        System.out.println("Телефон: " + order.getPhone());
        System.out.println("Email: " + order.getEmail());
        System.out.println("Тип комнаты: " + order.getRoomType());
        System.out.println("Площадь: " + order.getArea());
        System.out.println("Зоны: " + Arrays.toString(order.getZones()));
        System.out.println("Стиль: " + order.getStyle());
        System.out.println("Бюджет: " + order.getBudget());
        System.out.println("Комментарий: " + order.getComment());
        return "OK";

    }
}
