package core.eda.transport;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class Producer {
  
  @Autowired
  RabbitTemplate rabbit;

  public Producer(){
  }

  @Scheduled(initialDelay = 500, fixedDelay = 1000)
  public void send(){
    String msg = new String("Hello Queue");
    rabbit.convertAndSend(TransportConfig.TRADING_EXCHANGE, TransportConfig.TRADING_QUEUE, msg);
  }

  public void send(String msg){
    rabbit.convertAndSend(TransportConfig.TRADING_EXCHANGE, TransportConfig.TRADING_QUEUE, msg);
  }
}
