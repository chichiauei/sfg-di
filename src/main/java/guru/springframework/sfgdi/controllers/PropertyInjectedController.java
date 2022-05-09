package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {


  @Qualifier("propertyInjectedGreetingService")
@Autowired
  public GreetingService greetingService;

//  public ProjectInjectedController(GreetingService greetingService) {
//    this.greetingService = greetingService;
//  }

  public String getGreeting(){
   return greetingService.sayGreeting();
  }
}
