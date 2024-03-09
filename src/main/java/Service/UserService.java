package Service;


import Models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void createUser(User user);
    public void deleteUser(User user);


}
