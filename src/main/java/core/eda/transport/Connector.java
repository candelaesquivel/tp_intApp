package core.eda.transport;

import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Connector {

  private static ConnectionFactory connectionFactory;

  private Connection connection;
	private Channel channel;

  public Connector(){
    connectionFactory = new ConnectionFactory();
  }

  public Channel createConnection() throws IOException, TimeoutException{
    connection = connectionFactory.newConnection();
    channel = connection.createChannel();
    return channel;
  }

  public void isRunning(){
    if (connection == null)
      System.out.println("Connection not running");

    if (connection.isOpen()){
      System.out.println("Connection Open: " + connection.toString());
      System.out.println("Channel Details: " + channel.toString());
    }
  }

  public void closeConnection() throws IOException, TimeoutException{
    if (channel.isOpen())
      channel.close();

    if (connection.isOpen())
      connection.close();
  }

  public void publish(String msg){
  }
}
