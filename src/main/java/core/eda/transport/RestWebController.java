package core.eda.transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeoutException;

@RestController
public class RestWebController {
  
  //ENDPOINT 1
  @GetMapping("/publishMessage")
 //@PostMapping("/publishMessage")
  public void publishMessage(){
    System.out.println("Publish Message");
  }
  /*public void PublishMessage(@RequestParam(name="channel") String exchange, @RequestParam(name="message") String message) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException  {
		TransportController.getInstance().sendMessage(exchange, message);
	}*/

//ENDPOINT 2
  @GetMapping("/bind")
//@PostMapping("/bind")
 public void bind(){
   System.out.println("Bind");
 }
 /*public void bind(@RequestParam(name="channel") String exchange, @RequestParam(name="subscriber") String queue) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException  {
  TransportController.getInstance().bind(exchange, queue);
}*/

//ENDPOINT 3
  @GetMapping("/broadcast")
//@PostMapping("/broadcast")
 public void broadcast(){
   System.out.println("Broadcast");
 }
 /*public void broadcast(@RequestBody String message) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException  {
  TransportController.getInstance().broadcast(message);
}*/

//ENDPOINT 4
  @GetMapping("/unbind")
//@PostMapping("/unbind")
 public void unbind(){
   System.out.println("Unbind");
 }
 /*public void unbind(@RequestParam(name="channel") String exchange, @RequestParam(name="subscriber") String queue) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, IOException, TimeoutException  {
  TransportController.getInstance().unbind(exchange, queue);
}*/

}