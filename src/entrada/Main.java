package entrada;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private AnchorPane myPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        myPane = FXMLLoader.load(getClass().getResource("entrada.fxml"));
        primaryStage.setScene(new Scene(myPane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}