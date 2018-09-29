package sample;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

import java.awt.event.ActionEvent;


public class AlertBoxMain extends Application
{
    Button button;
    Stage window  = new Stage();
    Scene scene;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;

        window.setTitle("Alert Box");
        Label label = new Label("Click This Button To Open AlertBox!");
        button = new Button("Alert Box");
        /*
        button.setOnAction(e -> AlertBox.Display());
          */

        window.setOnCloseRequest(e -> {
            e.consume();
            boolean answer = ConfirmBox.Confirm();

            if(answer)
            {
                window.close();
            }
        });

        button.setOnAction(e -> {
            boolean answer = ConfirmBox.Confirm();

            if(answer)
            {
                AlertBox.Display();
            }
        });



        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        window.show();
    }
}
