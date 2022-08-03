
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class Pro6_64010476 extends Application {
	
	public void start(Stage primaryStage) {
		
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(
			btPause, btResume, btReverse);

		
		FanPanes fan = new FanPanes();

		
		Slider slider = new Slider();
		slider.setMax(5);
		fan.rateProperty().bind(slider.valueProperty());

		
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		
		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise_16_18"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
    public static void main(String[] args) {
        launch(args);
    }
}