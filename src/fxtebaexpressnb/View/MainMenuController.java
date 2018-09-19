package fxtebaexpressnb.View;

import fxtebaexpressnb.Utility.FileFXML;
import com.jfoenix.controls.JFXButton;
import fxtebaexpressnb.Utility.BaseController;
import fxtebaexpressnb.Utility.ViewMode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainMenuController extends BaseController{

    @Override
    public void PageFistLoad(Object object, ViewMode mode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void PageFistLoad(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ChangeViewMode(ViewMode mode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private enum selectedMenu{
        Dashboard,
        Pengirim
    }
    private selectedMenu menuSelect;
    
    private void loadData(selectedMenu m){
        menuSelect=m;
        btnDashboard.setDisable(menuSelect==selectedMenu.Dashboard);
        btnPengiriman.setDisable(menuSelect==selectedMenu.Pengirim);

    }
    

    @FXML
    private BorderPane borderPane;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnPengiriman;

    @FXML
    public AnchorPane centerPane;

    @FXML
    void btnDashboardAction(ActionEvent event) {
        loadData(selectedMenu.Dashboard);
        DashboardController.loadDashboardController(this);
    }

    @FXML
    void btnPengirimanAction(ActionEvent event) {
        loadData(selectedMenu.Pengirim);
        //InsertUserAccountController.loadInsertTransactionController(this);
        UserAccountListController.LoadUserAccountList(this);
    }
    @FXML
    void initialize() {
        this.setLoginData("Asu Anjing");
        DashboardController.loadDashboardController(this,borderPane);
        super.setBorderPane(borderPane);
        loadData(selectedMenu.Dashboard);
    }

    @Override
    public AnchorPane getCenterPane() {
        return this.centerPane;
    }

    @Override
    public URL getFileUrl(FileFXML fXML) {
        return getClass().getResource(fXML.toString());
    }

    @Override
    public void PageFistLoad() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

