package spring.jenkins.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
//Added new line
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		}
	
	@RequestMapping("/")
	public String status(){
		return "Spring Jenkins is UP";
	}
	
	public void test() {
		
		String name="Saurabh Delh Dei";
		System.out.println("Added fcode for jenkins demo");
		}
	public void display(){
		System.out.println("Added Method to test Jenkin");
		System.out.println("Added new line...");
	// Added Comments on here
		//one more here
		
	}
	
}
