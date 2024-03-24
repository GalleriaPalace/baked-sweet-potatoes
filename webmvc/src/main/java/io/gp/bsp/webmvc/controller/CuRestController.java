package io.gp.bsp.webmvc.controller;

import io.gp.bsp.webmvc.controller.model.OrderRequest;
import io.gp.bsp.webmvc.controller.model.SampleRequest;
import io.gp.bsp.webmvc.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CuRestController {
    public static final long BSP_PRICE = 2500L;

    @GetMapping("/bsp/price")
    public long getPrice() {
        return BSP_PRICE;
    }

    /**
     * https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-config/message-converters.html
     * RequestBody, ResponseBody는 MessageConverter에 의해 처리됨
     * MessageConverter에서 parameter 이름을 이용해 매핑하는 기능은 JAVA 8에서 추가됨 (OrderRequest 생성자, setter 미존재 상태)
     * 스프링에서는 WebMvcConfigurer를 이용해 HttpMessageConverter를 커스터마이징이 가능
     * @param orderRequest
     * @return
     */
    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        return new Order(orderRequest);
    }

    @PostMapping("/sample")
    @ResponseStatus(HttpStatus.CREATED)
    public SampleRequest createSample(@RequestBody SampleRequest sampleRequest) {
        return sampleRequest;
    }

    /*
    아래와 같이 REST-API를 설계
    @GetMapping("/orders/{orderNo}")
    @ResponseStatus(HttpStatus.OK)
    public void

    @PatchMapping("/orders/{orderNo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void

    @DeleteMapping("/orders/{orderNo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void*/
}
