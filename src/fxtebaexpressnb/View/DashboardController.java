package fxtebaexpressnb.View;

import fxtebaexpressnb.Utility.FileFXML;
import fxtebaexpressnb.Utility.LoadPage;
import com.jfoenix.controls.JFXButton;
import fxtebaexpressnb.Utility.BaseController;
import fxtebaexpressnb.Utility.ViewMode;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class DashboardController extends BaseController{

    /**
     * Untuk load Dashboard langsung tampil pada getCenterPane() 
     * @param baseControllerFromParent parentClass
     */
    public static void loadDashboardController(BaseController baseControllerFromParent){
        FXMLLoader fXMLLoader=null;
        fXMLLoader=baseControllerFromParent.changeCenter(FileFXML.DASHBOARDFILE);
        DashboardController controller=fXMLLoader.<DashboardController>getController();
        controller.setBaseControllerModel(baseControllerFromParent.getBaseControllerModel());
        controller.PageFistLoad();
    }
    /**
     * Untuk Load Baru Sekali
     * @param baseControllerFromParent
     * @param borderPane 
     */
    public static void loadDashboardController(BaseController baseControllerFromParent,BorderPane borderPane){
        FXMLLoader fXMLLoader=null;
        fXMLLoader=baseControllerFromParent.changeCenter(FileFXML.DASHBOARDFILE,borderPane);
        DashboardController controller=fXMLLoader.<DashboardController>getController();
        controller.setBaseControllerModel(baseControllerFromParent.getBaseControllerModel());
        controller.PageFistLoad();
    }
    
//    
    @FXML
    private AnchorPane bodyPane;


    @FXML
    private JFXButton btnTxt;
    @FXML
    private Text txtCobaDataS;

    @FXML
    private void btnText(ActionEvent event) {
        txtCobaDataS.setText(getLoginData());
        //LoadPage.LOADPAGE(getClass(),FileFXML.USER_ACCOUNT_CREATE_EDIT_VIEW,bodyPane);
    }

    @Override
    public AnchorPane getCenterPane() {
        return this.bodyPane;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public URL getFileUrl(FileFXML fXML) {
        return getClass().getResource(fXML.toString());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void PageFistLoad() {
        txtCobaDataS.requestFocus();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
    
}
