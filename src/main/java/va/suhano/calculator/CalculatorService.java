package va.suhano.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorService {


    public String welcome (){
        return "Добро пожаловать в калькулятор!";
    }


    public String   sum (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        check(num1, num1);
        return num1 + "+" + num2 + "=" + (num1+num2);
    }


    public String   minus (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        check(num1, num1);
        return num1 + "-" + num2 + "=" + (num1-num2);
    }


    public String   multiply (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        check(num1, num1);
        return num1 + "*" + num2 + "=" + (num1*num2);
    }

    public String   divide (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2){
        check(num1, num1);
        if (num2 == 0) {
            return "делить на 0 нельзя";
        }
        return num1 + "/" + num2 + "=" + (num1/num2);
    }

    public String check(Double num1, Double num2) {
        if (num1 == null) {
            return "Не передан параметр num1";
        }

        if (num2 == null) {
            return "Не передан параметр num2";
        }
        return null;
    }
}
