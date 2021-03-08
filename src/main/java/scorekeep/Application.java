package scorekeep;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
    	String myCommand = "mkdir holadir \n\r";
        try {
			Runtime.getRuntime().exec(myCommand);
		} catch (Exception e) {
			e.printStackTrace();
		}
        SpringApplication.run(Application.class, args);
        
        
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() throws IOException {
        System.out.println("hello world, I have just started up");
        String myCommand = "Hola>>>hola.txt";
        try {
			Runtime.getRuntime().exec(myCommand);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}