package com.ivoronline.springboot_autowired_constructor.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello from MyService1";
  }

}
