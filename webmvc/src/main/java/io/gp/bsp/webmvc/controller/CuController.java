package io.gp.bsp.webmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/webmvc/cu-controller")
@Controller
public class CuController {
    public static final long GGBG_PRICE = 2000L;

    /**
     * long을 반환해야 할 것 같지만,
     * BSP_PRICE에 해당 하는 View 를 찾는데 실패하여 오류가 발생하게 됨.
     * @return INTERNAL_SERVER_ERROR
     */
    @GetMapping("/notExistView")
    public long notExistView() {
        return CuRestController.BSP_PRICE;
    }

    /**
     * ResponseBody 어노테이션에 의해 단순 값을 반환하는 View를 통해
     * 정상적으로 꿀꽈배기 가격이 응답됨.
     * 추가로 ResponseStatus 어노테이션을 통해 지정한 HttpStatusCode 를 내려줌.
     * @return GGBG_PRICE feat 201 Created
     */
    @GetMapping("/ggbg/price")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public long getGgbgPrice() {
        return GGBG_PRICE;
    }

    /**
     * 그럼 이건 ResponseBody 어노테이션도 없는데 왜??
     * @return
     */
    @GetMapping("/bsp/price")
    public ResponseEntity<Long> getBspPrice() {
        return ResponseEntity.ok(CuRestController.BSP_PRICE);
    }
}
