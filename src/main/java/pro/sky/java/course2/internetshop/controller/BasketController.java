package pro.sky.java.course2.internetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.internetshop.service.BasketService;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/basket")

public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping("/add")
    public void addToBasket(@RequestParam ArrayList<Integer> idList) {
        basketService.addToBasket(idList);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getFromBasket() {
        return basketService.getFromBasket();
    }
}