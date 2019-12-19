package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
/*import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;*/
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			/*Circle c = new Circle(100,275,50);
			c.setFill(Color.DARKORANGE);
			c.setStroke(Color.ORANGERED);
			c.setStrokeWidth(7);
			Circle c2 = new Circle(0,0,50);
			c2.setFill(Color.YELLOW);
			Line l1 = new Line(80,350,375,195);
			l1.setStroke(Color.BLACK);
			l1.setStrokeWidth(15);
			Line l2 = new Line(190,350,220,275);
			l2.setStroke(Color.BLACK);
			l2.setStrokeWidth(7);
			Line l3 = new Line(250,350,220,275);
			l3.setStroke(Color.BLACK);
			l3.setStrokeWidth(7);
			Rectangle r = new Rectangle(250,100,100,100);
			r.setFill(Color.LIGHTGREEN);
			r.setStroke(Color.GREEN);
			r.setStrokeWidth(7);
			root.getChildren().add(l1);
			root.getChildren().add(l2);
			root.getChildren().add(l3);
			root.getChildren().add(r);
			root.getChildren().add(c);
			root.getChildren().add(c2);
*/
			
			ObservableList<String> jours = FXCollections.observableArrayList("Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche");
			ListView<String> lvJours = new ListView<String>(jours);
			lvJours.setPrefSize(200, 150);
			Label rep = new Label("Choisir un jour");
			MultipleSelectionModel<String> lvSelModel = lvJours.getSelectionModel();
			lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>(){
				public void changed(ObservableValue<? extends String> selected,String oldval,String newval)
				{
					rep.setText("Vous avez choisi : "+newval);
				}
			});
			root.getChildren().addAll(lvJours,rep);
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("First Application");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
