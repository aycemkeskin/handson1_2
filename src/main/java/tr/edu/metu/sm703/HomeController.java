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
    int t = 1;
    int sum = x + y + z + t;

    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message2 sum of x, y, z, t: ", sum);
    }
}
