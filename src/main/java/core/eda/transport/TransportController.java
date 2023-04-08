package core.eda.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class TransportController {
  
  @Autowired
  Producer producer;

  public void publish(){
    RandomString rnd = new RandomString();
    String msg = rnd.nextString();
    producer.send(msg);
  }
}
