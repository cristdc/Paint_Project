package test;

import clases.TipoPincel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PincelTester extends Application {

    /*PARA COMPROBAR LOS PINCELES SE TIENE QUE CAMBIAR
      EL NULL POR EL TIPO DE PINCEL QUE SE QUIERE COMPROBAR*/
    public static final TipoPincel TIPO_PINCEL = TipoPincel.PINCEL_SORPRESA;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas c = new Canvas(400,400);
        StackPane sp = new StackPane(c);
        Scene s = new Scene(sp);
        GraphicsContext gc = c.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        primaryStage.setScene(s);
        primaryStage.show();

        //COMPROBAR SI ESTA BIEN
        LineaDiagonal ld = new LineaDiagonal(TIPO_PINCEL.getPincel());
        ld.dibujarLinea(gc);
    }
}
