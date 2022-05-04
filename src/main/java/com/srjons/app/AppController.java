package com.srjons.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AppController {

  @GetMapping("/health")
  public String checkHealth() {
    return "OK";
  }

  @GetMapping("/time")
  public String timeNow() {
    return LocalDateTime.now().toString();
  }


  @GetMapping("/")
  public String index() {
    return "hi <br>" + LocalDateTime.now().toString();
  }

  @GetMapping("/hello/{name}")
  public String hello(@PathVariable("name") String name) {
    return "Hello " + name + "!";
  }
}
