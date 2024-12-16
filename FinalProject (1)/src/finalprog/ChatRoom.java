package finalprog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a chat room where users can participate and exchange messages.
 */
public class ChatRoom {
    private String roomId;
    private List<User> participants;
    private List<Message> messages;
    private boolean isActive;

    /**
     * Creates a new chat room with the specified room ID.
     *
     * @param roomId the unique identifier for the chat room.
     */
    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.participants = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.isActive = true;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void addParticipant(User user) {
        participants.add(user);
    }

    public void removeParticipant(User user) {
        participants.remove(user);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}