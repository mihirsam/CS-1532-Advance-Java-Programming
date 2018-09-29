package sample;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox
{
    public static void Display()
    {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Alert Box");
        window.setMinWidth(250);

        Label label = new Label("This Is Alert Box YO!");
        Button closeButton = new Button("Close Alert Box");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 200, 300);

        window.setScene(scene);
        window.showAndWait();

    }
}
