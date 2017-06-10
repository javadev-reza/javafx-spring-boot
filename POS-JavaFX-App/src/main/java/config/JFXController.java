package config;

import com.pos.library.JFXComponent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Reza
 */
public class JFXController extends JFXComponent {
    
    private static final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFXConfig.class);
    private static final String FXML = "/com/pos/fxml/";
    private static final String CSS = "/com/pos/styles/";
    
    private Map<String, Object> load(String url) {
        Map<String, Object> result = new HashMap<>();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setControllerFactory(clazz -> applicationContext.getBean(clazz));
            loader.setLocation(getClass().getResource(url));
            Object objectLoader = loader.load();
            Object objectController = loader.getController();
            result.put("loader", objectLoader);
            result.put("controller", objectController);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void startApplication(Stage primaryStage, String fxml, String css, String title){
        try{
            Map<String, Object> result = new JFXController().load(FXML+fxml);
            Parent root = (Parent) result.get("loader");
            Scene scene = new Scene(root);
            scene.getStylesheets().add(CSS+css);
            primaryStage.setMaximized(true);
            primaryStage.setTitle(title);
            primaryStage.setScene(scene);  
            primaryStage.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public Object setVisible(String fxml, String css, String title){
        Object controller = new Object();
        try{
            Map<String, Object> result = new JFXController().load(FXML+fxml);
            //---------------------------
            Parent root = (Parent) result.get("loader");
            controller = result.get("controller");
            //---------------------------
            Scene scene = new Scene(root);
            scene.getStylesheets().add(CSS+css);
            //---------------------------
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setMaximized(true);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return controller;
    }
}
