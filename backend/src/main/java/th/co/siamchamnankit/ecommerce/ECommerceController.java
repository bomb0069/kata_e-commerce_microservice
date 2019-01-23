package th.co.siamchamnankit.ecommerce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ECommerceController {

    @RequestMapping("/")
    public String index() {
        return "ECommerce is working !";
    }

}