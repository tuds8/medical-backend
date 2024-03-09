package Controllers;

import Models.User;
import Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value="/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PutMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user){
        System.out.println("create");
        userService.createUser(user);
    }
}