import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DrowShape extends Application{
    
    GraphicsContext gc;

    public void start(Stage stage){
        stage.setTitle("TestApplication");
        stage.setWidth(400);
        stage.setHeight(300);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}