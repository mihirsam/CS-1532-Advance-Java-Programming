package sample;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SwitchScene extends Application
{
    Stage window;
    Button buttonOne, buttonTwo;
    Scene sceneOne, sceneTwo;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage)
    {
        window = primaryStage;

        //ButtonOne
        Label labelOne = new Label("Welcome To Scene One");
        buttonOne = new Button("Go To Scene 2");
        buttonOne.setOnAction(e -> window.setScene(sceneTwo));

        //layoutOne
        VBox layoutOne = new VBox(20);
        layoutOne.getChildren().addAll(labelOne, buttonOne);
        sceneOne = new Scene(layoutOne, 600, 300);


        //ButtonOne
        Label labelTwo = new Label("Welcome To Scene Two");
        buttonTwo = new Button("Go To Scene 1");
        buttonTwo.setOnAction(e -> window.setScene(sceneOne));

        //layoutOne
        VBox layoutTwo = new VBox(20);
        layoutTwo.getChildren().addAll(labelTwo, buttonTwo);
        sceneTwo = new Scene(layoutTwo, 600, 300);

        window.setScene(sceneOne);
        window.setTitle("Switch Window");
        window.show();
    }

}





