module com.byexpert.javafxmvvm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.byexpert.javafx.mvvmapp to javafx.fxml;

    exports com.byexpert.javafx.mvvmapp;
    exports com.byexpert.javafx.modelchangeapp;
}