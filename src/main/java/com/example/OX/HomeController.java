package com.example.OX;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/ox")
public class HomeController {

    @GetMapping("/home")
    public Map<String, String> home() {

        HashMap<String, String> json = new HashMap<String, String>();
        json.put("message", "hi!!");
        return json;
    }

    @GetMapping("/create-match")
    public Map home(@RequestBody String player1, @RequestBody String player2) {

        HashMap<String, String> json = new HashMap<String, String>();
        json.put("message", "Hi!!");

        return json;
    }


}
