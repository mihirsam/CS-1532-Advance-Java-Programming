package sample;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class EmbeddingLayout extends Application
{
    Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            boolean answer = ConfirmBox.Confirm();

            if(answer)
            {
                window.close();
            }
        });

        Label label = new Label();

        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("file");
        Menu exit = new Menu("exit");
        MenuItem add = new MenuItem("add");
        MenuItem print = new MenuItem("print");
        print.setOnAction(e -> {
            label.setText("Hello World");
        });

        file.getItems().addAll(add, print);
        menuBar.getMenus().addAll(file, exit);

        VBox layout = new VBox(20);
        Button alertBox = new Button("Alert Box");
        Button closeWindow = new Button("Exit");
        alertBox.setOnAction(e -> AlertBox.Display());
        closeWindow.setOnAction(e -> window.close());
        layout.getChildren().addAll(label, alertBox, closeWindow);
        layout.setAlignment(Pos.CENTER);

        BorderPane layoutMain = new BorderPane();
        layoutMain.setTop(menuBar);
        layoutMain.setCenter(layout);

        Scene scene = new Scene(layoutMain, 500, 500);
        window.setScene(scene);
        window.show();
    }
}
