/**
 * Sample Skeleton for 'UserAccountList.fxml' Controller Class
 */

package fxtebaexpressnb.View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import fxtebaexpressnb.Utility.BaseController;
import fxtebaexpressnb.Utility.FileFXML;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class UserAccountListController extends BaseController{
    public static void LoadUserAccountList(BaseController baseControllerFromParent){
        FXMLLoader fXMLLoader=null;
        fXMLLoader=baseControllerFromParent.changeCenter(FileFXML.USER_ACCOUNT_LIST_VIEW);
        UserAccountListController controller=fXMLLoader.<UserAccountListController>getController();
        controller.setBaseControllerModel(baseControllerFromParent.getBaseControllerModel());
        controller.pageFistLoad();
    }
    @FXML // fx:id="btnAddUser"
    private JFXButton btnAddUser; // Value injected by FXMLLoader

    @FXML // fx:id="treeTableView"
    private JFXTreeTableView<?> treeTableView; // Value injected by FXMLLoader

    @FXML // fx:id="firstNameColumn"
    private JFXTreeTableColumn<?, ?> firstNameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="lastNameColumn"
    private JFXTreeTableColumn<?, ?> lastNameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="emailColumn"
    private JFXTreeTableColumn<?, ?> emailColumn; // Value injected by FXMLLoader

    @FXML // fx:id="usernameColumn"
    private JFXTreeTableColumn<?, ?> usernameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="statusColumn"
    private JFXTreeTableColumn<?, ?> statusColumn; // Value injected by FXMLLoader

    @FXML // fx:id="actionColumn"
    private JFXTreeTableColumn<?, ?> actionColumn; // Value injected by FXMLLoader

    @FXML // fx:id="btnFirst"
    private JFXButton btnFirst; // Value injected by FXMLLoader

    @FXML // fx:id="btnBefore"
    private JFXButton btnBefore; // Value injected by FXMLLoader

    @FXML // fx:id="txtPage"
    private JFXTextField txtPage; // Value injected by FXMLLoader

    @FXML // fx:id="txtMaxPage"
    private Text txtMaxPage; // Value injected by FXMLLoader

    @FXML // fx:id="btnNext"
    private JFXButton btnNext; // Value injected by FXMLLoader

    @FXML // fx:id="btnLast"
    private JFXButton btnLast; // Value injected by FXMLLoader

    @Override
    public void pageFistLoad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AnchorPane getCenterPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public URL getFileUrl(FileFXML fXML) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @FXML
    void addUserOnAction(ActionEvent event) {

    }

}
