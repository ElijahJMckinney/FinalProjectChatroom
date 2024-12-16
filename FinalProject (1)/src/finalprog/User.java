package finalprog;

/**
 * Represents a user in the chat room.
 */
class User {
    private String username;
    private String status;
    private String userId;
    private List<Message> messageHistory;

    /**
     * Creates a new user with the specified username, status, and user ID.
     *
     * @param username the username of the user.
     * @param status   the current status of the user (e.g., Online, Offline).
     * @param userId   the unique identifier for the user.
     */
    public User(String username, String status, String userId) {
        this.username = username;
        this.status = status;
        this.userId = userId;
        this.messageHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void addMessage(Message message) {
        messageHistory.add(message);
    }

    public List<Message> getMessageHistory() {
        return messageHistory;
    }
}