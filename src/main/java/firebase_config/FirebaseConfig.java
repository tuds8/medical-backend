package firebase_config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig {
    public void configureFirebaseConnection() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("classpath:config/personalhealthrecord-212cc-firebase-adminsdk-jbmr4-da35f32697.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://personalhealthrecord-212cc-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

    }
}
