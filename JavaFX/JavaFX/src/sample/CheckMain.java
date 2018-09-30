package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

import static javafx.application.Application.launch;

public class CheckMain extends Application
{
    Stage window;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        window = primaryStage;

        Label menu = new Label("MENU");

        CheckBox chicken = new CheckBox("Chicken");
        CheckBox fish = new CheckBox("Fish");
        CheckBox mushroom = new CheckBox("Mushroom");

        if (chicken.isSelected())
        {
            fish.setSelected(false);
            mushroom.setSelected(false);
        }

        if (fish.isSelected())
        {
            chicken.setSelected(false);
            mushroom.setSelected(false);
        }

        if (mushroom.isSelected())
        {
            fish.setSelected(false);
            chicken.setSelected(false);
        }

        CheckBox colddrink = new CheckBox("Cold Drinks");
        Label order = new Label();

        Button orderButton = new Button("Order");
        orderButton.setOnAction(e -> {
            Bill(order, chicken, fish, mushroom, colddrink);
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(menu, chicken, fish, mushroom, colddrink, orderButton, order);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 500, 700);

        window.setScene(scene);
        window.show();
    }

    public void Bill(Label label, CheckBox chicken, CheckBox fish, CheckBox mushroom, CheckBox colddrink)
    {
        String message = "Your Order : \n";

        if(chicken.isSelected())
        {
            message += "Chicken\n";
        }

        if(fish.isSelected())
        {
            message += "Fish\n";
        }

        if(mushroom.isSelected())
        {
            message += "Mushroom\n";
        }

        if(colddrink.isSelected())
        {
            message += "Cold Drink\n";
        }

        label.setText(message);
    }
}
