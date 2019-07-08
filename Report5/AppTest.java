import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AppTest extends Application{
    public void start(Stage stage){
        stage.setTitle("TestApplication");
        stage.setWidth(400);
        stage.setHeight(300);

        Button button1 = new Button("A");
        Button button2 = new Button("B");
        Button button3 = new Button("C");
        Button button4 = new Button("D");

        button1.setOnAction(event -> System.out.println("Push Button 'A'"));
        button2.setOnAction(event -> System.out.println("Push Button 'B'"));
        button3.setOnAction(event -> System.out.println("Push Button 'C'"));
        button4.setOnAction(event -> System.out.println("Push Button 'D'"));

        button1.setPrefSize(80, 30);
        button2.setPrefSize(80, 30);
        button3.setPrefSize(80, 30);
        button4.setPrefSize(80, 30);

        HBox root = new HBox(10);

        root.getChildren().addAll(button1,button2,button3,button4);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}