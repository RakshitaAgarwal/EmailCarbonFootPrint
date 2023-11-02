package Model;

public class CarbonFootPrintResponse {
    private String email = "";
    private String domain = "";
    private double inboxCarbonFootPrint = 0;
    private double spamCarbonFootPrint = 0;
    private double sentCarbonFootPrint = 0;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setInboxCarbonFootPrint(double carbonFootprint) {
        this.inboxCarbonFootPrint = carbonFootprint;
    }

    public double getInboxCarbonFootPrint() {
        return this.inboxCarbonFootPrint;
    }

    public void setSpamCarbonFootPrint(double carbonFootprint) {
        this.spamCarbonFootPrint = carbonFootprint;
    }

    public double getSpamCarbonFootPrint() {
        return this.spamCarbonFootPrint;
    }

    public void setSentCarbonFootPrint(double carbonFootprint) {
        this.sentCarbonFootPrint = carbonFootprint;
    }

    public double getSentCarbonFootPrint() {
        return this.sentCarbonFootPrint;
    }
}