package sample;


import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class AfterLogIn
{
    public static void DisplayDetails(String username, String password)
    {
        Stage window = new Stage();
        window.setTitle("Information Display");

        Label userName = new Label("UserName : "+ username);
        Label passWord = new Label("Password : "+ password);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(userName, passWord);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 500, 600);
        window.setScene(scene);
        window.show();
    }
}
