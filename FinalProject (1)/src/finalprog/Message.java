package finalprog;

/**
 * Represents a message exchanged in a chat room.
 */
class Message {
    private String sender;
    private String content;
    private Date timestamp;
    private boolean isSent;

    /**
     * Creates a new message with the specified sender and content.
     *
     * @param sender  the sender of the message.
     * @param content the content of the message.
     */
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = new Date();
        this.isSent = true;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean isSent) {
        this.isSent = isSent;
    }
}