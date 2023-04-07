package core.eda.transport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;

@Configuration
public class TransportConfig {

  public static final String TRADING_EXCHANGE = "trading-exchange";
  public static final String TRADING_QUEUE = "trading-queue";

  @Bean
  public FanoutExchange fanout(){
    return new FanoutExchange(TRADING_EXCHANGE);
  }

  @Bean
  public Queue queue(){
    return new Queue(TRADING_QUEUE);
  }

  @Bean
  public Binding binding(Queue queue, FanoutExchange exchange){
    return BindingBuilder.bind(queue).to(exchange);
  }

  @Bean
  public Producer producer(){
    return new Producer();
  }

  @Bean
  public Consumer consumer(){
    return new Consumer();
  }

  @Bean
  public Connector connector(){
    return new Connector();
  }
}
