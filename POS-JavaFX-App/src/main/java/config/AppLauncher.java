package config;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        JFXController controller = new JFXController();
        controller.startApplication(primaryStage, "Login.fxml", "login.css", "Point Of Sales");
    }
}
