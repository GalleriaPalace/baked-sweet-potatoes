package io.gp.bsp.webmvc.controller;

import io.gp.bsp.webmvc.model.MyResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/webmvc/view-controller")
@Controller
public class ViewController {
    // TODO
    // 내가 만든 클래스(MyResponseEntity)를 처리할 수 있는 View를 만들고 Handler에 등록해보가.
    // /bsp/my-view가 404로 응답한 이유를 알아보자. (/notExistView는 500 Internal Server Error를 반환하던데..)

    @GetMapping("/bsp/my-view")
    public MyResponseEntity<String> myResponseEntityView(String value) {
        return new MyResponseEntity<>(value);
    }
}
