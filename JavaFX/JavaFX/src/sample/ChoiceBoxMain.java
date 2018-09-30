package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class ChoiceBoxMain extends Application
{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;
        window.setTitle("Choice Box");

        Label selection = new Label();

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Apple", "Ball", "Cat");
        choiceBox.getSelectionModel().select(0);
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            selection.setText("You have selected "+newValue);
        });

        Label label = new Label();
        Button order = new Button("Order");
        order.setOnAction(e -> {
            label.setText("Ordered item is " +choiceBox.getValue());
        });

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(choiceBox, order, selection, label);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(layout, 200, 300);

        window.setScene(scene);
        window.show();
    }
}
