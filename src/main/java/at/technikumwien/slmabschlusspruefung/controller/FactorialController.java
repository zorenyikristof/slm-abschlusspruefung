package at.technikumwien.slmabschlusspruefung.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FactorialController {
    private int sum = 0;
    @RequestMapping("/api/factorial")
    public int getFactorial(@RequestParam int number){
        int result = calculateFactorial(number);
        sum = sum + result;
        return result;
    }

    private int calculateFactorial(int number){
        if (number!= 1){
            return number * calculateFactorial(number-1);
        }else{
            return 1;
        }
    }
    @RequestMapping("/api/factorial/total")
    public int getTotalFactorial(){
        return sum;
    }
}
