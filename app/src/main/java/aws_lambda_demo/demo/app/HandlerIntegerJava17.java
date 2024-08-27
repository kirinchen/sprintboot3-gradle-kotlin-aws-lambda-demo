package aws_lambda_demo.demo.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.boot.SpringApplication;

// Handler value: example.HandlerInteger
public class HandlerIntegerJava17 implements RequestHandler<IntegerRecord, Integer> {

    @Override
    /*
     * Takes in an InputRecord, which contains two integers and a String.
     * Logs the String, then returns the sum of the two Integers.
     */
    public Integer handleRequest(IntegerRecord event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("String found: " + event.message());
        String[] args = {};
        var contex = SpringApplication.run(Application.class, args);
        DemoService demoService = contex.getBean(DemoService.class);
        int demoInt = demoService.getDemoInt();
        logger.log("demoService: " + demoService);
        return event.x() + event.y() + demoInt;
    }
}

record IntegerRecord(int x, int y, String message) {
}
