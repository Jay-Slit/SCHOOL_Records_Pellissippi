/*
 * File: BookStoreController
 * Author: Cameron Justice
 * Date: Apr 18, 2017
 * Summary:
*/
package lab4.BookStore;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BookStoreController {

    @FXML
    ListView lvTitle;
    @FXML
    ListView lvPrice;
    @FXML
    ListView lvAddToCart;
    @FXML
    ListView lvCart;
    @FXML
    Label lblPreTaxPrice;
    @FXML
    Label lblTaxPrice;
    @FXML
    Label lblTotalPrice;
    
    double preTaxPrice;
    double taxPrice;
    double totalPrice;
    
    ArrayList<Book> bookList;
    
    public void handleFileMenuExitBtn(ActionEvent event){
        System.exit(0);
    }
    
    public void handleHelpMenuAboutBtn(ActionEvent event){
        //TODO: Change to FXML file for loadable instead of createable
        VBox aboutPane = new VBox();
        Label nameLbl = new Label("College's BookStore");
        Label versLbl = new Label("Version: 1.1");
        Label descLbl = new Label("An online store interface for the College "
                + "BookStore.");
        aboutPane.getChildren().addAll(nameLbl,versLbl,descLbl);
        Scene aboutScene = new Scene(aboutPane, 400,200);
        Stage aboutStage = new Stage();
        aboutStage.setScene(aboutScene);
        aboutStage.show();
    }
    
    public void getBookList(){
        BookParseControl bParse = new BookParseControl();
        bookList = bParse.parseBookList();
    }
    
    public void createStoreLayout(){
        
        lblPreTaxPrice.textProperty().set("0.0");
        lblTaxPrice.textProperty().set("0.0");
        lblTotalPrice.textProperty().set("0.0");
        
        for(Book book : bookList){
            lvTitle.getItems().add(book.getTitle());
            lvPrice.getItems().add(book.getPrice());
            Button btnAddToCart = new Button("Add To Cart");
            
            btnAddToCart.setOnAction((ActionEvent e) -> {
                addToCart(book.getTitle(), book.getPrice());
                updatePreTaxPrice(Double.parseDouble(book.getPrice()));
            });
            
            lvAddToCart.getItems().add(btnAddToCart);
            
        }
    }
    
    public void clearCart(){
        lblPreTaxPrice.textProperty().set("0.0");
        lblTaxPrice.textProperty().set("0.0");
        lblTotalPrice.textProperty().set("0.0");
        
        lvCart.getItems().clear();
    }
    
    private void addToCart(String title, String price){
        lvCart.getItems().add(title + " " + price);
        
    }
    
    private void updatePreTaxPrice(double toAdd){
        preTaxPrice += toAdd;
        lblPreTaxPrice.textProperty().set(Double.toString(round(preTaxPrice)));
        updateTaxPrice();
    }
    
    private void updateTaxPrice(){
        taxPrice = (preTaxPrice * .09);
        lblTaxPrice.textProperty().set(Double.toString(round(taxPrice)));
        updateTotalPrice();
    }
    
    private void updateTotalPrice(){
        totalPrice = preTaxPrice + taxPrice;
        lblTotalPrice.textProperty().set(Double.toString(round(preTaxPrice)));
    }
    
    private static double round(double value) {
        int places = 2;
     
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
