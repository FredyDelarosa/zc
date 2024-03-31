module org.example.zc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.zc to javafx.fxml;
    exports org.example.zc;
}