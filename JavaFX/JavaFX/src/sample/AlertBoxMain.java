package sample;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;


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
        window.setTitle("Alert Box");
        Label label = new Label("Click This Button To Open AlertBox!");
        button = new Button("Alert Box");
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, 500, 500);

        window.setScene(scene);
        window.show();
    }
}
