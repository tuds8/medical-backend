package Controllers;

import Models.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/user/")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        System.out.println("create");
        userService.createUser(user);
    }
}

/*
@RestController
@RequestMapping(value="/api/v1/posts/")
public interface PostController {
    //CREATE
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity.BodyBuilder addPostToUser(@PathVariable String user_id, @RequestBody PostDTO postDTO);

    //READ
    @GetMapping(value="/{user_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<PostDTO> getMyPosts(@PathVariable String user_id);
 */