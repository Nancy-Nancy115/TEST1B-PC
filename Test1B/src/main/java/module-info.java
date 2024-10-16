module com.example.test1b {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test1b to javafx.fxml;
    exports com.example.test1b;
}