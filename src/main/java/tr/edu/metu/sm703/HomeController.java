package tr.edu.metu.sm703;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    
    int x = 5;
    int y = 2;
    int z = 3;

    int sum = x + y + z;

    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message sum of x, y, and z: ", sum);
    }
}
