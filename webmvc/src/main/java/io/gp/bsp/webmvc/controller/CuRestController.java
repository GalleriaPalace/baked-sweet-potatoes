package io.gp.bsp.webmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/webmvc/cu-rest-controller")
@RestController
public class CuRestController {
    public static final long BSP_PRICE = 2500L;

    @GetMapping("/bsp/price")
    public long getPrice() {
        return BSP_PRICE;
    }
}
