package nl.bldn.example.springboot.warexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWarResource {

    private final String message;

    @Autowired
    public HelloWarResource(@Value("${hellowar.message}") String message) {
        this.message = message;
    }

    @RequestMapping(path = "/hellowar", method = RequestMethod.GET)
    public String helloWar() {
        return message;
    }

}
