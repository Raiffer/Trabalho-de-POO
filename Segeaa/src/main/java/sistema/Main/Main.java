package sistema.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sistema.model.Model;
import sistema.view.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewLogin view = new ViewLogin();
        Model model = new Model();
        view.initViewLogin(model);

        Scene scene = new Scene(view.getFxmlLoader().load());
        primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}