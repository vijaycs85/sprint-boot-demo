package com.playground.Controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by vijayachandranmani on 01/07/15.
 *
 */
@RestController
@RequestMapping(value="context")
public class DemoController {
    @RequestMapping(value = "/demo/{firstname}", method = RequestMethod.GET)
    public @ResponseBody test demo(@PathVariable String firstname, @RequestParam String lastname) {
        return new test(firstname, lastname);
    }
}
