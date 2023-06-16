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
import java.util.Base64;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {
    
    int x = 5;
    int y = 2;
    int z = 3;

    int sum = x + y + z;
    String password = "password123";

    HttpRequest request;
    String serializedObject = request.getParameters().toString();
    ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(serializedObject)));
    Object obj = in.readObject();

    public HomeController() throws IOException, ClassNotFoundException {
        //TODO: add sth here
    }

    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("Total sum of x, y, and z: ", sum);
    }
}
