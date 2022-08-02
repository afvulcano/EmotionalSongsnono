module esongs.emotionalsongs {
    requires javafx.controls;
    requires javafx.fxml;


    opens esongs.emotionalsongs to javafx.fxml;
    exports esongs.emotionalsongs;
}