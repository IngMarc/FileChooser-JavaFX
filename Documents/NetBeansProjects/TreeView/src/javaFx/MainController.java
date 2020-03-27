/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Lenovo
 */
public class MainController implements Initializable {
    
    
    @FXML
    private TreeView<String> treeView;
    
    Image icon=new Image(getClass().getResourceAsStream("/img/folder.png"));
    @FXML
    private Label clickShow;
                
    private void handleButtonAction(ActionEvent event) {
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TreeItem<String> root=new TreeItem<>("This PIC", new ImageView(icon));
         root.setExpanded(true);
         TreeItem<String> nodeA= new TreeItem<>("My Document", new ImageView(icon));
         TreeItem<String> nodeB= new TreeItem<>("My Pictures", new ImageView(icon));
         TreeItem<String> nodeC= new TreeItem<>("My Music", new ImageView(icon));
         //SubAdd
         TreeItem<String> nodeA1= new TreeItem<>("Workspace", new ImageView(icon));
         TreeItem<String> nodeA2= new TreeItem<>("Downloads", new ImageView(icon));
         TreeItem<String> nodeA3= new TreeItem<>("NetBeansProjects", new ImageView(icon));
         
         nodeA.getChildren().addAll(nodeA1,nodeA2,nodeA3);
         root.getChildren().add(nodeA);         
         root.getChildren().add(nodeB);
         root.getChildren().add(nodeC);
          
         treeView.setRoot(root);
          
    }    

    @FXML
    private void mouseClick(MouseEvent event) {
        if(event.getClickCount()==2){
            TreeItem<String> item=treeView.getSelectionModel().getSelectedItem();
            clickShow.setText(item.getValue());
            clickShow.setVisible(true);
            
        }
    }
    
}
