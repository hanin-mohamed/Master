package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {
  @GetMapping("/{userId}")
    public ResponseEntity<String> getMessage(@PathVariable long userId) {
      String message = "Hello User: " + userId;
      return new ResponseEntity<>(message, HttpStatus.OK);
  }
}
