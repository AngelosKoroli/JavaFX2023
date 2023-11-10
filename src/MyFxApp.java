import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import java.io.FileInputStream;

public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Controls
        FileInputStream input = new FileInputStream("src/iconmonstr-home-thin-240.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        CheckBox checkBox1 = new CheckBox("Green");
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Label label1;
        label1 = new Label("Angelos's Experiment");
        ColorPicker colorPicker = new ColorPicker();

        Color value = colorPicker.getValue();

        // Layouts
        HBox hbox = new HBox(button1,imageView,colorPicker);
        VBox vbox = new VBox(checkBox1,label1 ,hbox, button2, button3, button4);
        Scene scene1 = new Scene(vbox, 1000, 1000);
        //button1.setOnAction(actionEvent -> {});

        // Stage
        primaryStage.setTitle("HBox Experiment 1");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

}