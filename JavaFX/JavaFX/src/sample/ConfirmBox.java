package sample;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox
{
    static Boolean answer;

    public static boolean Confirm()
    {

        Button yesButton, noButton;
        yesButton = new Button("YES");
        noButton = new Button("NO");

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Confirm Box");

        Label label = new Label("Do you want to continue?");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();

        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);

        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 200, 400);

        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}
