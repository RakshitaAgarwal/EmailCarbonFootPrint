import Model.EmailInfo;
import Model.CarbonFootPrintResponse;
import Model.CarbonFootprintConstants;

public class CarbonFootprintCalculator {

    EmailInfo entity = new EmailInfo();
    CarbonFootPrintResponse response = new CarbonFootPrintResponse();

    public CarbonFootPrintResponse fetchResponse(EmailInfo entity) {
        setEntity(entity);
        setResponse();
        return response;
    }

    private void setEntity(EmailInfo entity) {
        this.entity = entity;
    }

    private void setResponse() {
        response.setEmail(this.entity.getEmail());
        response.setDomain(fetchDomainName());
        response.setInboxCarbonFootPrint(getInboxCarbonFootPrint());
        response.setSentCarbonFootPrint(getSentCarbonFoortPrint());
        response.setSpamCarbonFootPrint(getSpamCarbonFootPrint());
    }

    private String fetchDomainName() {
        String email = entity.getEmail();
        int startIndex = email.indexOf('@');
        return email.substring(startIndex + 1, email.length() - 4);
    }

    private double getInboxCarbonFootPrint() {
        return entity.getNoOfInboxMessages() * CarbonFootprintConstants.INBOX_CARBON_EMMISIONS_PER_G;
    }

    private double getSentCarbonFoortPrint() {
        return entity.getNoOfSentMessages() * CarbonFootprintConstants.SENT_CARBON_EMMISIONS_PER_G;
    }

    private double getSpamCarbonFootPrint() {
        return entity.getNoOfSpamMessages() * CarbonFootprintConstants.SPAM_CARBON_EMMISIONS_PER_G;
    }
}