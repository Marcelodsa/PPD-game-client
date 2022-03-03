module com.example.tsoroyematatuclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tsoroyematatuclient to javafx.fxml;
    exports com.example.tsoroyematatuclient;
}