import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Comparator;

public class RoomTableApp extends Application {
    private final TableView<Room> table = new TableView<>();
    private final ObservableList<Room> rooms = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Room Table");

        TableColumn<Room, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Room, Double> areaColumn = new TableColumn<>("Area");
        areaColumn.setCellValueFactory(new PropertyValueFactory<>("area"));

        TableColumn<Room, Integer> windowsColumn = new TableColumn<>("Windows");
        windowsColumn.setCellValueFactory(new PropertyValueFactory<>("windows"));

        TableColumn<Room, Boolean> hasBalconyColumn = new TableColumn<>("Has Balcony");
        hasBalconyColumn.setCellValueFactory(new PropertyValueFactory<>("hasBalcony"));

        TableColumn<Room, String> useColumn = new TableColumn<>("Use");
        useColumn.setCellValueFactory(new PropertyValueFactory<>("use"));

        table.getColumns().addAll(nameColumn, areaColumn, windowsColumn, hasBalconyColumn, useColumn);
        table.setItems(rooms);

        Button addButton = new Button("Add Room");
        addButton.setOnAction(e -> addRoom());

        Button sortButton = new Button("Sort by Area");
        sortButton.setOnAction(e -> sortRoomsByArea());

        VBox vbox = new VBox();
        vbox.getChildren().addAll(table, addButton, sortButton);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addRoom() {
        rooms.add(new ResidentialRoom("Новая комната", 25.0, 2, true, "Центральное"));
        rooms.add(new ResidentialRoom("Новая комната 1", 22.0, 1, false, "Электрическое"));
    }

    private void sortRoomsByArea() {
        rooms.sort(Comparator.comparingDouble(Room::getArea));
    }
}

