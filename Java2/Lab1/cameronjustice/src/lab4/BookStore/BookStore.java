/*
 * File: BookStore
 * Author: Cameron Justice
 * Date: Apr 18, 2017
 * Summary:
*/
package lab4.BookStore;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lab4.BookStore.BookParseControl;


public class BookStore extends Application{
    
    private ArrayList<String> cartItems;
    private ArrayList<Book> bookList;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Book Store");
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BookStore.fxml"));
        
        //Load the FXML for the store scene
        Parent root = loader.load();
        
        BookStoreController appCtrl = loader.getController();
        
        appCtrl.getBookList();
        appCtrl.createStoreLayout();
        
        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    private void addToCart(String title, String price){
        
    }
    
    public static void main(String[] args){
        launch();
    }
}
