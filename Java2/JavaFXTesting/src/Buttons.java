
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

/*
 * File: Buttons
 * Author: Cameron Justice
 * Date: Mar 28, 2017
 * Summary:
*/

public class Buttons extends Application {
    
    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        Button BtnOk = new Button("Ok");
        Circle circle = new Circle(5);
        pane.getChildren().addAll(BtnOk, circle);
        
        BtnOk.setOnAction((ActionEvent event) -> {
            circle.setRadius(circle.getRadius()*2);
        });
        
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Primary Stage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
