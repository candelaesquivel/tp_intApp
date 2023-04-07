package core.eda.transport;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Consumer {
  @RabbitListener(queues = {TransportConfig.TRADING_QUEUE})
  public void tradingConsume(String in){
    System.out.println("Trading Queue Consuming: " + in);
  }
}
