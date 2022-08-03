
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Pro1_64010476 extends Application {
	
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();

		
        pane.add(new ImageView(new Image("C:/Users/patip/OneDrive/Desktop/OOP LAB/week9.2/javafx/src/Lab9/images/uk.png")), 0, 0);
		pane.add(new ImageView(new Image("C:/Users/patip/OneDrive/Desktop/OOP LAB/week9.2/javafx/src/Lab9/images/ca.png")), 1, 0);
		pane.add(new ImageView(new Image("C:/Users/patip/OneDrive/Desktop/OOP LAB/week9.2/javafx/src/Lab9/images/china.png")), 0, 1);
		pane.add(new ImageView(new Image("C:/Users/patip/OneDrive/Desktop/OOP LAB/week9.2/javafx/src/Lab9/images/us.png")), 1, 1);
		

		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display images"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
    public static void main(String[] args) {
        launch(args);
    }
}