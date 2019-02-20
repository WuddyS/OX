package com.example.OX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ox")
public class HomeController {

    @GetMapping("/create-match")
    public List  home(@RequestBody String player1, @RequestBody String player2) {

        List<?> list = new ArrayList<>();

        return list;
    }


}
