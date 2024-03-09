package Controllers;

import Models.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/user")
    public void createUser(@RequestBody User user){
        System.out.println("create");
        userService.createUser(user);
    }
}
