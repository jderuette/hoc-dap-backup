package fr.houseofcode.dap.server.mgw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mgw
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Bibabou!";
    }
}