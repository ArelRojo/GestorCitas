/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorcitas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import DBAccess.ClinicDBAccess;
import javafx.collections.FXCollections;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lisas
 */
public class PacientesController implements Initializable {

    @FXML
    private TableView<?> table_pacientes;
    @FXML
    private TextField tf_buscarPaciente;
    @FXML
    private Button b_buscarPaciente;
    @FXML
    private TableColumn<ClinicDBAccess, ?> foto;
    @FXML
    private TableColumn<ClinicDBAccess, ?> dni;
    @FXML
    private TableColumn<ClinicDBAccess, String> nom;
    @FXML
    private TableColumn<ClinicDBAccess, String> apellidos;
    @FXML
    private TableColumn<ClinicDBAccess, ?> telef;
    @FXML
    private TableColumn<ClinicDBAccess, ?> email;
    private ObservableList<ClinicDBAccess> datos = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buscar(ActionEvent event) {
       
    }

    @FXML
    private void b_add(ActionEvent event) {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("/vista/VistaPersona.fxml"));
        Parent root = miCargador.load();
        Persona p = new Persona("", "");
        FichaPacienteController vpc = (FichaPacienteController) miCargador.getController();
        vpc.myInitialize(datos, true);
        vpc.initPersona(p);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Añadir pesonas");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
    
}
