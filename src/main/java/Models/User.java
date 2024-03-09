package Models;

import lombok.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Data
public class User {
    private String user_id;
    private String name;
    private String role;


}
