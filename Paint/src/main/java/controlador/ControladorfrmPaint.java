package controlador;

import clases.Pincel;
import clases.Punto;
import clases.Reseteable;
import clases.TipoPincel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorfrmPaint implements Initializable {

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

        try{
            FileChooser fc = new FileChooser();
            File ruta = fc.showOpenDialog(null);
            URL url = ruta.toURL();
            Image i = new Image(url.toString());
            Bounds bounds = this.cnvLienzo.localToScreen(cnvLienzo.getBoundsInLocal());
            cnvLienzo.getGraphicsContext2D().drawImage(i,0,0,(int)bounds.getWidth(),(int)bounds.getHeight());

        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void cambiarColor(ActionEvent event) {
        Color c = cpkColor.getValue();
        if(c != null){
            cnvLienzo.getGraphicsContext2D().setFill(c);
        }
    }

    @FXML
    void dibujarPunto(MouseEvent event) {
        this.cmbPinceles.getSelectionModel().getSelectedItem().dibujar(this.cnvLienzo.getGraphicsContext2D(), new Punto(event.getX(), event.getY()));
    }

    @FXML
    void empezarDibujar(MouseEvent event) {
        Pincel p = this.cmbPinceles.getSelectionModel().getSelectedItem();

        if (p instanceof Reseteable pr){
            pr.resetear();
        }
        this.dibujarPunto(event);
    }

    @FXML
    void guardarImagen(ActionEvent event){
        Bounds bounds = this.cnvLienzo.localToScreen(cnvLienzo.getBoundsInLocal());
        Rectangle rectangulo = new Rectangle((int)bounds.getMinX(), (int)bounds.getMinY(),(int)bounds.getWidth(),(int)bounds.getHeight());
        try {
            Robot robot = new Robot();
            BufferedImage captura = robot.createScreenCapture(rectangulo);
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Guardar imagen");
            File file = fileChooser.showSaveDialog(null);
            if (file != null) {
                ImageIO.write(captura, "png", file);
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR).showAndWait();
        }
    }

    @FXML
    void nuevaImagen(ActionEvent event) {
        GraphicsContext gc = this.cnvLienzo.getGraphicsContext2D();
        Paint colorRelleno = gc.getFill();
        Color b = Color.web("#ffffff");
        this.cnvLienzo.getGraphicsContext2D().setFill(b);
        gc.fillRect(0,0,cnvLienzo.getWidth(),cnvLienzo.getHeight());
        this.cnvLienzo.getGraphicsContext2D().setFill(colorRelleno);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.inicializarIconos();
        this.inicializarComboBox();
        this.nuevaImagen(null);
    }

    @FXML
    void inicializarIconos(){
        Image img = new Image("open-file-icon.png");
        ImageView imageView = new ImageView(img);
        Image img2 = new Image("Save-icon.png");
        ImageView imageView2 = new ImageView(img2);
        Image img3 = new Image("Action-file-new-icon.png");
        ImageView imageView3 = new ImageView(img3);
        Image img4 = new Image("Pencil-icon.png");
        ImageView imageView4 = new ImageView(img4);
        this.btnAbrir.setGraphic(imageView);
        this.btnGuardar.setGraphic(imageView2);
        this.btnNuevo.setGraphic(imageView3);
        this.imgPinceles.setImage(img4);
    }
    @FXML
    void inicializarComboBox(){
        List<Pincel> pinceles = TipoPincel.getPinceles();
        for(Pincel i : pinceles){
            this.cmbPinceles.getItems().add(i);
        }
        this.cmbPinceles.getSelectionModel().selectFirst();
    }

}
