package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("JP")
@Service("i18nService")
public class I18nJapaneseService implements GreetingService{


  @Override
  public String sayGreeting() {
    return "Ohayogazaimasu from Japanese";
  }
}

