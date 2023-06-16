package tr.edu.metu.sm703;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

@Controller
public class HomeController {
    
    int x = 5;
    int y = 2;
    int z = 3;

    int sum = x + y + z;
    String password = "password123";

    private List<Integer> l;

    public HomeController(Integer... is) {
        this.l = Arrays.asList(is);
    }

    public List<Integer> getList() {
        return l;
    }

    public static void main(String[] args) {
        HomeController a = new HomeController(23, 42);
        for (Iterator<Integer> iter = a.getList().iterator(); iter.hasNext();)
            if (iter.next()%2 != 0)
                iter.remove();
    }
    void emptyBlock() {
        try {

        } catch (Exception e) {

        }
    }
    @Get
    public Map<String, Object> index() {
        //fixme
        return Collections.singletonMap("Total sum of x, y, and z: ", sum);
    }
}
