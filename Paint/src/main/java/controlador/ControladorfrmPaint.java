package controlador;

import clases.Pincel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;

import java.io.File;

public class ControladorfrmPaint {

    @FXML
    private Button btnAbrir;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnNuevo;

    @FXML
    private ComboBox<Pincel> cmbPinceles;

    @FXML
    private Canvas cnvLienzo;

    @FXML
    private ColorPicker cpkColor;

    @FXML
    private ImageView imgPinceles;

    @FXML
    private BorderPane panel;

    @FXML
    void abrirImagen(ActionEvent event) {
        FileChooser fc=new FileChooser();
        File ruta = fc.showOpenDialog(null);
        /*String nombreArchivo = fc.getInitialFileName();
        ClassLoader.getSystemResourceAsStream(nombreArchivo);*/

        Image image = new Image(ruta.toString());
        this.cnvLienzo.getGraphicsContext2D().drawImage(image,);
    }

    @FXML
    void dibujarPunto(MouseEvent event) {

    }

    @FXML
    void empezarDibujar(MouseEvent event) {

    }

    @FXML
    void guardarImagen(ActionEvent event) {

    }

}
