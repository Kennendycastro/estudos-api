package produtos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class Controller {

    @GetMapping("/helloworld")
    public String HelloWorld(){
        return "Hello World!!!";
    }

}
