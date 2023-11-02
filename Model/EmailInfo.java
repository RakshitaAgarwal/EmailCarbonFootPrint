package Model;

public class EmailInfo {
    private String email = "";
    private int noOfInboxMessages = 0;
    private int noOfSpamMessages = 0;
    private int noOfSentMessages = 0;

    public EmailInfo() {
    }

    public EmailInfo(String email, int inbox, int spam, int sent) {
        this.email = email;
        this.noOfInboxMessages = inbox;
        this.noOfSpamMessages = spam;
        this.noOfSentMessages = sent;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNoOfInboxMessages() {
        return this.noOfInboxMessages;
    }

    public int getNoOfSpamMessages() {
        return this.noOfSpamMessages;
    }

    public int getNoOfSentMessages() {
        return this.noOfSentMessages;
    }
}