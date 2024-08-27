package aws_lambda_demo.demo.app;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String surname;
    private String emailAddress;

    //standard constructor, getters and setters
}