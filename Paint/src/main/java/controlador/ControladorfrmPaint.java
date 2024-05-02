package controlador;

import clases.Pincel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

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

    }

    @FXML
    void cambiarColor(ActionEvent event) {

    }

    @FXML
    void dibujarPunto(MouseEvent event) {
        this.cmbPinceles.getItems();
        this.cnvLienzo.getGraphicsContext2D().strokeLine(event.getX(), event.getY(), event.getX(), event.getY());
    }

    @FXML
    void empezarDibujar(MouseEvent event) {

    }

    @FXML
    void guardarImagen(ActionEvent event) {

    }

    @FXML
    void nuevaImagen(ActionEvent event) {

    }

}
