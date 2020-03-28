/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tuto;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 *
 * @author Marc : kodjotsivanyo@gmail.com
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ListView listView;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       if(event.getSource()==button){
           FileChooser fc=new FileChooser();
           //initialise by path
           fc.setInitialDirectory(new File("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\FileChooser\\dist"));
            //fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
            fc.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png"));
           
            //File selectedFile=fc.showOpenDialog(null);
           List<File> selectedFiles=fc.showOpenMultipleDialog(null);
           if(selectedFiles!=null){
               for (int i = 0; i < selectedFiles.size(); i++) {
                    listView.getItems().add(selectedFiles.get(i).getAbsolutePath());                   
               }
           }else{
               System.out.println("File doesn't exist");
           }
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
