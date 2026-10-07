package edu.wctc.wholesale.Controller;


import edu.wctc.wholesale.dto.OrderDto;
import edu.wctc.wholesale.service.WholesaleOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders/")
public class WholesaleOrderRestController {
    private final WholesaleOrderService wholesaleOrderService;

    public WholesaleOrderRestController(
            WholesaleOrderService wholesaleOrderService) {
        this.wholesaleOrderService = wholesaleOrderService;
    }

    @GetMapping
    public List<OrderDto> getOrders() {
        return wholesaleOrderService.findAll()
                .stream()
                .map(OrderDto::new)
                .toList();
    }
}
