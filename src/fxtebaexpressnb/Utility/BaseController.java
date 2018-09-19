/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxtebaexpressnb.Utility;

import fxtebaexpressnb.DatabaseManajement.DBContext;
import fxtebaexpressnb.View.DashboardController;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author AsusX450J
 */
public abstract class BaseController{
    
    private BaseControllerModel baseControllerModel;
    
    public abstract void PageFistLoad();
    
    public abstract void PageFistLoad(Object object,ViewMode mode);
    /**
     * untuk Load Data yang sudah ada dan otomatis menjadi View Mode
     * @param object 
     */
    public abstract void PageFistLoad(Object object);
    
    public abstract void ChangeViewMode(ViewMode mode);
    
    public BaseControllerModel getBaseControllerModel() {
        if(this.baseControllerModel==null){
            this.baseControllerModel=new BaseControllerModel();
        }
        return baseControllerModel;
    }

    public void setBaseControllerModel(BaseControllerModel baseControllerModel) {
        this.baseControllerModel = baseControllerModel;
//        loginData=baseControllerModel.getDataCoba();
    }

    public BorderPane getBorderPane() {
        return baseControllerModel.getBorderPane();
    }

    public void setBorderPane(BorderPane borderPane) {
        this.baseControllerModel.setBorderPane(borderPane);
    }
    
    
    protected String getLoginData(){
        return baseControllerModel.getDataCoba();
    }
    
    public void setLoginData(String loginData){
        this.getBaseControllerModel().setDataCoba(loginData);
    }
    
    /**
     * Untuk Mengatur Center AnchorPane Pada setiap Anak BaseController
     * @return 
     */
    public abstract AnchorPane getCenterPane();
    
    /**
     * Untuk Mendapatkan membuat URL data yang lebih Sepesifik
     * @param fXML
     * @return 
     */
    public abstract URL getFileUrl(FileFXML fXML);
    
    /**
     * Fungsi Ini Untuk loading file di Anchorpane yang file 
     * @param fileFXML Lokasi File Nya
     * @param oldBaseController OldController
     * @return Hasil Nya Untuk Di ambil Contrroller nya pada Static yang harus ada di setiap anaknya
     * Cotoh Bisa Dilihat Di dashboard Controller dan Main Menu
     * @Author BangDolla08
     * 
     * Contoh Penggunaan:
     *      public static void loadDashboardController(BaseController load){
     *          FXMLLoader fXMLLoader=null;
     *          fXMLLoader=load.changeCenter(FileFXML.DASHBOARDFILE);
     *          DashboardController namaClass Anakan nya
     *          fXMLLoader.<DashboardController>getController().setBaseControllerModel(load.getBaseControllerModel());
     *      }
     * 
     * dan penggunaaan tinggal di pakek aja dengan cara memanggil static tersebut contoh
     * DashboardController.loadDashboardController(this);
     * tujuan nya kenapa agar tidak ruwet Guys Manggil nya 
     * semua View Dan Controller Di taruh 1 Folder
     */
    public FXMLLoader changeCenter(FileFXML fileFXML){
        FXMLLoader fXMLLoader=null;
        try {
            fXMLLoader=new FXMLLoader(getFileUrl(fileFXML));
            AnchorPane anchorPane= fXMLLoader.load();
            //getCenterPane().getChildren().setAll(anchorPane);
            getBorderPane().setCenter(fXMLLoader.load());
        }catch (IOException ioEx){
            System.out.print("File Data Tidak ada "+ioEx.getMessage());
        }catch (Exception ioEx){
            System.out.print("Exeption "+ioEx.getMessage());
        }
        return fXMLLoader;
    }

    public FXMLLoader changeCenter(FileFXML fileFXML,BorderPane borderPane){
        FXMLLoader fXMLLoader=null;
        try {
            fXMLLoader=new FXMLLoader(getFileUrl(fileFXML));
            AnchorPane anchorPane= fXMLLoader.load();
            //getCenterPane().getChildren().setAll(anchorPane);
            borderPane.setCenter(anchorPane);
        }catch (IOException ioEx){
            System.out.print("File Data Tidak ada "+ioEx.getMessage());
        }catch (Exception ioEx){
            System.out.print("Exeption "+ioEx.getMessage());
        }
        return fXMLLoader;
    }
    
    protected DBContext getDBContext(){
        return this.baseControllerModel.getbContext();
    }
    
    protected int Page=0;
    protected int bucketSize=10;
    
}
