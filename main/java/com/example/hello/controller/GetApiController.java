package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")


public class GetApiController {
    @GetMapping(path = "/hello")   //http:localhost:9090/api/get/hello
    public String Hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-varible/{name}
    // {}안의 내용과 name이 동일해야된다
    // 변수를 다른걸 써야할 경우 @PathVariable(name = "name)의 형태로 써준다
    @GetMapping("/path-variable/{name}")
    public String pathVarible(@PathVariable String name){
        System.out.println("PathVariable : "+ name);
        return name;
    }

    // queryParameter란? 검색시 여러가지 매개변수 인자
    // ?key=value&key2=value2
    // http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach( entry -> {
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
           System.out.println("\n");

           sb.append(entry.getKey()+"="+entry.getValue()+"\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ){

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+""+email+""+age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        //RequestParma 이용 x 객체가 들어오면 미리 정의해 놨기 떄문에 현업에서 많이 이용
        return userRequest.toString();
    }
}
