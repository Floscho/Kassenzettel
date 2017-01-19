/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kassenzettel2;

import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Teilnehmer
 */
public class Warenkorb extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Warenkorb");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(15);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Dropdown
        
        
        ComboBox einsBisFünf0 = new ComboBox();
        
        einsBisFünf0.getItems().add("1");
        einsBisFünf0.getItems().add("2");
        //("1", "2", "3", "4", "5");
        grid.add(einsBisFünf0, 0, 1);
        einsBisFünf0.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println(einsBisFünf0.getItems());
            }
        });

        ComboBox einsBisFünf1 = new ComboBox();
        einsBisFünf1.getItems().addAll("1", "2", "3", "4", "5");
        grid.add(einsBisFünf1, 0, 2);

        ComboBox einsBisFünf2 = new ComboBox();
        einsBisFünf2.getItems().addAll("1", "2", "3", "4", "5");
        grid.add(einsBisFünf2, 0, 3);

        ComboBox einsBisFünf3 = new ComboBox();
        einsBisFünf3.getItems().addAll("1", "2", "3", "4", "5");
        grid.add(einsBisFünf3, 0, 4);

        ComboBox einsBisFünf4 = new ComboBox();
        einsBisFünf4.getItems().addAll("1", "2", "3", "4", "5");
        grid.add(einsBisFünf4, 0, 5);

        ComboBox einsBisFünf5 = new ComboBox();
        einsBisFünf5.getItems().addAll("1", "2", "3", "4", "5");
        grid.add(einsBisFünf5, 0, 6);

        
        //Artikel
        Label milch = new Label("Milch 0,65€");
        grid.add(milch, 1, 1);
        Label butter = new Label("Butter 0,93€");
        grid.add(butter, 1, 2);
        Label zigaretten = new Label("Milch 0,65€");
        grid.add(zigaretten, 1, 3);
        Label essig = new Label("Zigaretten 7€");
        grid.add(essig, 1, 4);
        Label schockolade = new Label("Schockolade 0,99€");
        grid.add(schockolade, 1, 5);
        Label bier = new Label("Bier 0,45€");
        grid.add(bier, 1, 6);
        
        //Button
        Button btn = new Button("Zur Kasse");
        btn.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                System.out.println("DöDö!"); 
            }
        });

        grid.add(btn, 2, 9);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    


    StackPane root = new StackPane();

    Scene scene = new Scene(root, 300, 250);

}
