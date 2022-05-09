package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class PrimaryGreetingCourse implements GreetingService{


  @Override
  public String sayGreeting() {
    return "return GreetingCourse from PrimaryGreetingCourse";
  }
}
