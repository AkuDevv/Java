package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    String username = "";
    String message = "";
    Socket clientSocket = null;
    TextArea messagesArea = null;

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox root = new VBox();
        root.setPadding(new Insets(20));

        Label userNameLabel = new Label("username :");
        TextField userNameField = new TextField();
        userNameField.textProperty().addListener((observable, oldValue, newValue) -> {
            this.username = newValue;
        });
        Label messagesLabel = new Label("Messages :");
        this.messagesArea = new TextArea();

        HBox hBox = new HBox();
        Label messageLabel = new Label("Enter message :");
        TextField messageField = new TextField();
        messageField.textProperty().addListener((observable, oldValue, newValue) -> {
            this.message = newValue;
        });
        Button btnSend = new Button("Send");
        btnSend.setOnAction(e -> {
            System.out.println(this.username);
            System.out.println(this.message);
            client();
        });

        hBox.getChildren().add(messageField);
        hBox.getChildren().add(btnSend);

        root.getChildren().add(userNameLabel);
        root.getChildren().add(userNameField);
        root.getChildren().add(messagesLabel);
        root.getChildren().add(this.messagesArea);
        root.getChildren().add(messageLabel);
        root.getChildren().add(hBox);

        primaryStage.setTitle("Chatroom");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
    }

    void client(){
        String serverName = "localhost";
        int port = 5000;
        try {
            this.clientSocket = new Socket(serverName,port);
        } catch (Exception e) {
            System.out.println("Client : impossible de suivre le socket du serveur");
        }
        try {
            PrintStream pr = new PrintStream(this.clientSocket.getOutputStream());
            InputStreamReader is = new InputStreamReader(this.clientSocket.getInputStream());
            BufferedReader bf = new BufferedReader(is);

            String msg = (this.username+" : "+this.message+"\n");

            pr.println(msg);
            pr.flush();

            msg = bf.readLine();
            this.messagesArea.appendText(msg+"\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
