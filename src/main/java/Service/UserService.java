package Service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void createUser();
    public void deleteUser();


}
