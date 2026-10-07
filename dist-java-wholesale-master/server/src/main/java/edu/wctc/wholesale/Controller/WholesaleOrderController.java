package edu.wctc.wholesale.Controller;


import edu.wctc.wholesale.service.WholesaleOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WholesaleOrderController {
    private final WholesaleOrderService wholesaleOrderService;

    public WholesaleOrderController(
            WholesaleOrderService wholesaleOrderService) {
        this.wholesaleOrderService = wholesaleOrderService;
    }

    @GetMapping("/")
    public String getOrders(Model model) {

        model.addAttribute(
                "orderList",
                wholesaleOrderService.findAll()
        );

        return "index";
    }
}
