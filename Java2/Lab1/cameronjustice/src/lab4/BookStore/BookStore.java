/*
 * File: BookStore
 * Author: Cameron Justice
 * Date: Apr 11, 2017
 * Summary:
*/
package lab4.BookStore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookStore extends Application {
    
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane pane = new Pane();
        
        createMenuBar(pane);
        
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void createMenuBar(Pane pane){
        MenuBar menuBar = new MenuBar();
        
        Menu menuFile = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        menuFile.getItems().add(exitItem);
        
        Menu menuHelp = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        
        exitItem.setOnAction((ActionEvent t) -> {
            System.exit(0);
        });
        
        aboutItem.setOnAction((ActionEvent t) -> {
            VBox aboutVBox = new VBox();
            Label nameLbl = new Label("BookStore");
            Label versLbl = new Label("1.0.1");
            Label descLbl = new Label("This application "
                    + "is the BookStore for CameronJustice "
                    + "Inc.");
            //TODO: Add Icon
            aboutVBox.getChildren().addAll(nameLbl,versLbl,descLbl);
            Scene aboutScene = new Scene(aboutVBox, 100,100);
            Stage aboutStage = new Stage();
            aboutStage.setScene(aboutScene);
            aboutStage.show();
        });
        
        menuHelp.getItems().add(aboutItem);
        
        menuBar.getMenus().addAll(menuFile,menuHelp);
        
        pane.getChildren().add(menuBar);
    }
    
}
