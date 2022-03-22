package test.perfect_number.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.perfect_number.service.PerfectNumberService;

import javax.websocket.server.PathParam;
import java.util.List;
/**
 * The API end point definitions for Perfect Number service
 **/

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PerfectNumberController {

    private final PerfectNumberService perfectNumberService;

    public PerfectNumberController(PerfectNumberService perfectNumberService) {
        this.perfectNumberService = perfectNumberService;
    }

    @GetMapping(value = "/{number}/is-it-perfect")
    public Boolean isItPerfect(@PathVariable("number") int number) {
        return perfectNumberService.isItPerfect(number);
    }

    @GetMapping(value = "/is-it-perfect")
    public List<Integer> findPerfectNumbers(@PathParam("start") int start, @PathParam("end") int end) {
        return perfectNumberService.checkForPerfectNumbers(start, end);
    }
}
