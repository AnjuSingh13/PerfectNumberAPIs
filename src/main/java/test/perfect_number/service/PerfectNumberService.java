package test.perfect_number.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * Description: This class have methods to
 * 1. Check if a given number is perfect.
 * 2. Find all perfect numbers between a range (start-end)
 */

@Service
public class PerfectNumberService {

    /**
     * This method is used to check if provided number is a perfect number or not.
     * Perfect numbers are those whose sum of divisors except itself is equal to
     * number itself. e.g 6=1+2+3
     * @param n which is number
     * @return
     */
    public Boolean isItPerfect(int n) {
        int sum = 0;
        if ( n > 0 )
        {
            //Looping here till number/2, (highest divisor of any number)
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return (sum == n);
        }
        return false;
    }
    /**
     * This method is used to provide list of perfect numbers between the given range
     * @param start which is start of the range
     * @param end which is end of the range
     * @return
     */
    public List<Integer> checkForPerfectNumbers(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {

            if (isItPerfect(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
        }


    }


