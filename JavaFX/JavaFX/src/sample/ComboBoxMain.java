package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class ComboBoxMain extends Application
{
    Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;
        window.setTitle("Combo Box");

        Label label = new Label();

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Apple", "Ball", "Cat");
        comboBox.getSelectionModel().select(0);

        comboBox.setOnAction(e -> {
            label.setText("Selected Item Is "+ comboBox.getValue());
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(comboBox, label);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(layout, 300, 600);
        window.setScene(scene);
        window.show();
    }
}
