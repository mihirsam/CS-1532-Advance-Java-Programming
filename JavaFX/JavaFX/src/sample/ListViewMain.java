package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class ListViewMain extends Application
{
    Stage window;
    ListView<String> listView;
    Button submit;
    Label label;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = new Stage();
        window = primaryStage;
        window.setTitle("List View");

        listView = new ListView<>();
        listView.getItems().addAll("Apple", "Ball", "Cat", "Doggy", "Elephant", "Fuck");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        submit = new Button("Submit");
        submit.setOnAction(e -> submitButton());

        label = new Label();

        VBox layout = new VBox(20);
        layout.getChildren().addAll(listView, submit, label);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 100, 200);

        window.setScene(scene);
        window.show();

    }

    private void submitButton()
    {
        String message = "";
        ObservableList<String> letters;

        letters = listView.getSelectionModel().getSelectedItems();

        for(String m : letters)
        {
            message += m + "\n";
        }

        label.setText(message);
        System.out.println(message);
    }
}
