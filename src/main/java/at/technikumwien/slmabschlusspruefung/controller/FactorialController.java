package at.technikumwien.slmabschlusspruefung.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FactorialController {
    @RequestMapping("/api/factorial")
    public int getFactorial(@RequestParam int number){
        return calculateFactorial(number);
    }

    private int calculateFactorial(int number){
        if (number!= 1){
            return number * calculateFactorial(number-1);
        }else{
            return 1;
        }
    }

}
