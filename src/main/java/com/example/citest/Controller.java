package com.example.citest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class Controller {
    @GetMapping("/tests")

    public String test(){
        return "에픽테스트";
    }
}
