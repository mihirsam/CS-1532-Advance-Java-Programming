package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class GridPaneMain extends Application
{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;
        window.setTitle("GridPane");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label userName = new Label("Username : ");
        GridPane.setConstraints(userName, 0, 0);

        TextField userInput = new TextField();
        GridPane.setConstraints(userInput, 1, 0);
        userInput.setPromptText("username");

        Label passWord = new Label("Password : ");
        GridPane.setConstraints(passWord, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button login = new Button("Log In");
        GridPane.setConstraints(login, 1, 2);

        grid.getChildren().addAll(userName, userInput, passWord, passInput, login);

        Scene scene = new Scene(grid, 500, 600);
        window.setScene(scene);
        window.show();

    }
}
