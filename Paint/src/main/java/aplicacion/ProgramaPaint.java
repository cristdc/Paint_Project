package aplicacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProgramaPaint extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("frmEquipos.fxml"));
            Scene e = new Scene(fxmlLoader.load());
            primaryStage.setScene(e);
            primaryStage.show();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
