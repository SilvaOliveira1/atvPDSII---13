module fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens fx to javafx.fxml;
    exports fx;
}