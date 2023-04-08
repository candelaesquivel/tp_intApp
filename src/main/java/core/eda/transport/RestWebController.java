package core.eda.transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebController {
  
  @GetMapping("/")
  public void publish(){
    System.out.println("Entrando en El Hello World");
  }
}
