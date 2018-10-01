package sample;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Scene;

public class TableViewMain extends Application
{
    TableView<Product> tree;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        TableColumn<Product, String> nameColumn = new TableColumn<>("NAME");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        //nameColumn.setMinWidth(200);

        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("QUANTITY");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        //quantityColumn.setMinWidth(100);

        TableColumn<Product, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        //price.setMinWidth(100);

        tree = new TableView<>();
        tree.setItems(getProduct());
        tree.getColumns().addAll(nameColumn, price, quantityColumn);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(tree);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 500, 500);

        window = new Stage();
        window.setTitle("Table View");
        window.setScene(scene);
        window.show();

    }

    public ObservableList<Product> getProduct()
    {
        ObservableList<Product> list = FXCollections.observableArrayList();
        list.add(new Product("Wire", 100, 10));
        list.add(new Product("Mango", 50, 100));
        list.add(new Product("some stuff", 100, 20));

        return list;
    }
}
