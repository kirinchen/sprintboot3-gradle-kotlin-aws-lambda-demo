package aws_lambda_demo.demo.app;

import org.springframework.stereotype.Service;

@Service
public class DemoService {


    public int getDemoInt(){

        try {
            Thread.currentThread().sleep(1000*60*3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return 100000000;
    }

}
