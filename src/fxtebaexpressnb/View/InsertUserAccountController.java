/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxtebaexpressnb.View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import fxtebaexpressnb.Utility.BaseController;
import fxtebaexpressnb.Utility.BaseControllerModel;
import fxtebaexpressnb.Utility.FileFXML;
import fxtebaexpressnb.Utility.ViewMode;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author AsusX450J
 */
public class InsertUserAccountController extends BaseController{

    public InsertUserAccountController() {
    }

    
    public InsertUserAccountController(BaseControllerModel baseControllerModel){
        setBaseControllerModel(baseControllerModel);
    }
    
    public static void loadInsertTransactionController(BaseController baseControllerFromParent){
        FXMLLoader fXMLLoader=null;
        fXMLLoader=baseControllerFromParent.changeCenter(FileFXML.USER_ACCOUNT_CREATE_EDIT_VIEW);
        InsertUserAccountController controller=fXMLLoader.<InsertUserAccountController>getController();
        controller.setBaseControllerModel(baseControllerFromParent.getBaseControllerModel());
        controller.PageFistLoad();
    }
    /**
     * Load View User Account Countroller dengan merubah nya menjadi view Mode dengan mengirim data primary key nya yang di pilih baik dari list ataupun dari tempatlain
     * @param baseController
     * @param primaryKey 
     */
    public static void loadInsertTransactionController(BaseController baseControllerFromParent,Object primaryKey){
        FXMLLoader fXMLLoader=null;
        fXMLLoader=baseControllerFromParent.changeCenter(FileFXML.USER_ACCOUNT_CREATE_EDIT_VIEW);
        InsertUserAccountController controller=fXMLLoader.<InsertUserAccountController>getController();
        controller.setBaseControllerModel(baseControllerFromParent.getBaseControllerModel());
        controller.PageFistLoad(primaryKey);
    }
    
    @FXML
    private JFXButton btnSave;
    @FXML
    private Text labelInsetAwb;
    @FXML
    private AnchorPane ParentPane;
    @FXML
    private JFXButton btnCancel;
    @FXML
    private JFXButton btnReset;
    @FXML
    private JFXTextField txtFirstName;
    @FXML
    private Text labelInsetAwb1;
    @FXML
    private JFXTextField txtLastName;
    @FXML
    private Text labelInsetAwb11;
    @FXML
    private JFXTextArea txtAlamat;
    @FXML
    private Text labelInsetAwb12;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private Text labelInsetAwb122;
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private Text labelInsetAwb121;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private Text labelInsetAwb2;
    @FXML
    private JFXTextField txtPhoneNumber;
    @FXML
    private Text labelInsetAwb21;
    @FXML
    private JFXComboBox<?> txtKantorCabang;

    /**
     * Initializes the controller class.
     */
    @FXML
    void initialize() {
    }
    private void btnAction(ActionEvent event) {
        btnSave.setDisable(true);
    }

    @Override
    public AnchorPane getCenterPane() {
        return  this.ParentPane;
    }

    @Override
    public URL getFileUrl(FileFXML fXML) {
        return getClass().getResource(fXML.toString());
    }

    @Override
    public void PageFistLoad() {
        labelInsetAwb.setText(getLoginData());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void btnSaveAction(ActionEvent event) {
    }

    @FXML
    private void btnCancelAction(ActionEvent event) {
    }

    @FXML
    private void btnResetAction(ActionEvent event) {
    }

    @Override
    public void PageFistLoad(Object object, ViewMode mode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void PageFistLoad(Object object) {
        // TODO buat untuk load data dari data primary key dan membuatnya tampil 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ChangeViewMode(ViewMode mode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
