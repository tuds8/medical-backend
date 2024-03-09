package Service;


import Models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void createUser(User user) {
        Firestore fireStore =  FirestoreClient.getFirestore();
        DocumentReference documentReference = fireStore.collection("user").document();

        user.setId(documentReference.getId());
        ApiFuture<WriteResult> apiFuture = documentReference.set(user);
    }

    @Override
    public void deleteUser(User user) {

    }
}
