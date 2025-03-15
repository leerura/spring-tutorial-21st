package com.ceos21.springboot;//패키지 선언 => 이 클래스가 해당 위치에 속한다.

import org.springframework.web.bind.annotation.GetMapping; //GET 요청
import org.springframework.web.bind.annotation.RestController; //REST API

@RestController
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
//public(접근자) String(반환 타입) index(메서드 이름)