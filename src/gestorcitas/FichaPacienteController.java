/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorcitas;

import DBAccess.ClinicDBAccess;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author lisas
 */
public class FichaPacienteController implements Initializable {

    @FXML
    private ImageView fotoPaciente;
    @FXML
    private TextField tf_apellido;
    @FXML
    private TextField tf_direccion;
    @FXML
    private TextField tf_localidad;
    @FXML
    private TextField tf_nacimiento;
    @FXML
    private TextField tf_sexo;
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_cp;
    @FXML
    private TextField tf_provincia;
    @FXML
    private TextField tf_ssocial;
    @FXML
    private TextField tf_telefono;
    @FXML
    private TextArea tf_observaciones;
    @FXML
    private Button b_guardar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void myInitialize(ObservableList<ClinicDBAccess> datos, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
