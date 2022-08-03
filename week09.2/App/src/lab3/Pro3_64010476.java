
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class Pro3_64010476 extends Application {
	
	public void start(Stage primaryStage) {
		
		int ranHour = (int)(Math.random() * 12);
        int ranMin = ((int)(Math.random() * 2) == 1 ? 30 : 0);
		ClockPane clock = new ClockPane(ranHour,ranMin, 0);
		String timeString = clock.getHour() + ":" + clock.getMinute()+ ":" + clock.getSecond();
		//clock.setSecondHandVisible(false); 
		//clock.setHourHandVisible(false);
		//clock.setMinuteHandVisible(false);
		Label time = new Label(timeString);

		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(time);
		BorderPane.setAlignment(time, Pos.TOP_CENTER);

		
		Scene scene = new Scene(pane, 250, 250); 
		primaryStage.setTitle("Exercise_14_28"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
        
	}
    public static void main(String[] args) {
        launch(args);
    }
}