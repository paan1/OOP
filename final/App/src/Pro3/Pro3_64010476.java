package Pro3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Pro3_64010476 extends Application{
 

    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media(ClassLoader.getSystemResource("Pro3/sample3.mp4").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.play();
       

        Button rewindButton = new Button("<<");
        rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));

        Button playButton = new Button(">");
        playButton.setOnAction(e -> {
             if (playButton.getText().equals(">")) {
             mediaPlayer.play();
             playButton.setText("||");
             } else {
             mediaPlayer.pause();
             playButton.setText(">");
             }
             });
             Slider slVolume = new Slider();
             
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);
        mediaPlayer.volumeProperty().bind(
        slVolume.valueProperty().divide(100));

        BorderPane pane = new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(rewindButton);
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playButton, rewindButton, 
        new Label("Volume"), slVolume);

        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
       
        pane.setCenter(mediaView);
        primaryStage.setTitle("MediaDemo");
        pane.setCenter(mediaView); 
        pane.setBottom(hBox);
    }
    public static void main(String[] args) {
        launch(args);
    }
}