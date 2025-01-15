package kevat24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class viikko1tehtavat {

    @RequestMapping("/main")
    @ResponseBody
    public String showGreeting() {
        return "Hei tyyppi";
    }

    @RequestMapping("sayHello")
    @ResponseBody
    public String returnGreeting1(
            @RequestParam(name = "nimesi", required = false, defaultValue = "Muumi") String etunimi) {
        return "Hei " + etunimi;
    }

    @RequestMapping("sayHelloAndIka")
    @ResponseBody
    public String returnGreeting2(
            @RequestParam(name = "nimesi", required = false, defaultValue = "Muumi") String etunimi,
            @RequestParam int age) {
        return "Hei " + etunimi + ", " + age + " vuotta";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String showIndex() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String showContact() {
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String showHelloWithLocationAndName(
            @RequestParam(name = "location") String loc,
            @RequestParam(name = "name") String personame) {
        return "Welcome to the " + loc + " " + personame + "!";
    }

}
