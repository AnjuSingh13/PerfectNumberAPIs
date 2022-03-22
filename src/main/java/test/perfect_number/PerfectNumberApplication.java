package test.perfect_number;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * Description: This Application "PerfectNumberApplication" implements REST Services to
 * 1. Check if a given number is perfect.
 * 2. Find all perfect numbers between a range (start-end)
 */
@SpringBootApplication
public class PerfectNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerfectNumberApplication.class, args);
    }

}
