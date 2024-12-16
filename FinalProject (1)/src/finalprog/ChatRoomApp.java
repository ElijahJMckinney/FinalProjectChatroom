package finalprog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX application for a simple chat room interface.
 */
public class ChatRoomApp extends Application {
    private ChatRoom chatRoom;

    @Override
    public void start(Stage primaryStage) {
        chatRoom = new ChatRoom("Room1");

        Label roomLabel = new Label("Chat Room ID: " + chatRoom.getRoomId());

        TextField participantInput = new TextField();
        participantInput.setPromptText("Enter participant username");

        Button addParticipantButton = new Button("Add Participant");
        addParticipantButton.setOnAction(event -> {
            String username = participantInput.getText();
            if (!username.isEmpty()) {
                User user = new User(username, "Online", String.valueOf(chatRoom.getParticipants().size() + 1));
                chatRoom.addParticipant(user);
                System.out.println("Participant added: " + username);
                participantInput.clear();
            }
        });

        TextField messageInput = new TextField();
        messageInput.setPromptText("Enter a message");

        Button sendMessageButton = new Button("Send Message");
        sendMessageButton.setOnAction(event -> {
            String content = messageInput.getText();
            if (!content.isEmpty()) {
                Message message = new Message("System", content);
                chatRoom.addMessage(message);
                System.out.println("Message sent: " + content);
                messageInput.clear();
            }
        });

        VBox root = new VBox(10, roomLabel, participantInput, addParticipantButton, messageInput, sendMessageButton);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Chat Room App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
