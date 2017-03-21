package ventanadialog;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button alertInfo;
    @FXML
    private Button alertConf;
    @FXML
    private Button inputDialog;
    @FXML
    private Button alertWarning;
    @FXML
    private Button alertConfVarios;
    @FXML
    private Button inputDialogVarios;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void alertas(ActionEvent event) {

        if (alertInfo.isFocused()) {
            information();

        } else if (alertConf.isFocused()) {
            confirmation();

        } else if (inputDialog.isFocused()) {
            inputDialog();
            GridPane grid = new GridPane();

            grid.add(new Label("Gracias"), 50, 50);
        }

    }

    public void information() {
        Alert alert;
        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Módulo de Programación");
        alert.setHeaderText("Bienvenido al curso de JAVA FX");
        alert.setContentText("En este tema veremos las ventas de dialogo");
        alert.showAndWait();
    }

    public void warning() {
        Alert alert;
        alert = new Alert(AlertType.WARNING);
        alert.setTitle("Módulo de Programación");
        alert.setHeaderText("Encuesta sobre el curso de JAVA FX");
        alert.setContentText("Necesitamos tu opinion");
        alert.showAndWait();
    }

    public void confirmation() {

        Alert alert;
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Módulo de Confirmacion");
        alert.setHeaderText("Encuesta sobre el curso de JAVA FX");
        alert.setContentText("¿Te gusta el curso de Java FX?");

        ButtonType botonSi = new ButtonType("Si");
        ButtonType botonNo = new ButtonType("No");
        ButtonType botonMeAbstengo = new ButtonType("Me Abstengo");

        alert.getButtonTypes().setAll(botonSi, botonNo, botonMeAbstengo);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == botonSi) {
            information();
        } else if (result.get() == botonNo) {
            error();
        } else if (result.get() == botonMeAbstengo) {
            warning();
        }
    }

    public void error() {
        Alert alert;
        alert = new Alert(AlertType.ERROR);
        alert.setTitle("Módulo de Programación");
        alert.setHeaderText("Encuesta sobre el curso de JAVA FX");
        alert.setContentText("Intentaremos mejorar");
        alert.showAndWait();
    }

    public void inputDialog() {
        TextInputDialog dialog;
        dialog = new TextInputDialog("name");

        dialog.setTitle("Módulo de programación");
        dialog.setHeaderText("Ventana para solicitar tu nombre");
        dialog.setContentText("nombre");

    }

}
