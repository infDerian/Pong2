import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

import javafx.scene.layout.Pane;
import javafx.scene.image.Image;

import javafx.animation.AnimationTimer;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.collections.SetChangeListener;
import javafx.animation.Timeline;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;

public class App extends Application {

    private ObservableSet<KeyCode> downKeys;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("view (experimental).fxml"));
        //Parent root = loader.load();

        Spielsteuerung sp = new Spielsteuerung();
        Pane p = (Pane) sp.getZeichenflaeche();
        Scene scene = new Scene(p);
        
        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("resources/pong_icon.png"));
        primaryStage.setTitle("Pong");
        primaryStage.setResizable(false);

        primaryStage.show();

        downKeys = FXCollections.observableSet();
        
        Timeline timer = new Timeline(new KeyFrame(
            javafx.util.Duration.millis(16), ae -> {
               
                    downKeys.stream().parallel().forEach(kc ->{
                        sp.pressed(kc);
                    });
        
            }));
        timer.setCycleCount(Animation.INDEFINITE);
        timer.play();
        
    
            
        scene.setOnKeyPressed(e -> {
            downKeys.add(e.getCode());
        });
        
        scene.setOnKeyReleased(evt->{
            downKeys.remove(evt.getCode());
        });
        
        primaryStage.setOnCloseRequest(e -> { System.exit(0); });
    }

    public static void main(String[] args) {
        launch(args);
    }
}