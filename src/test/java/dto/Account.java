package dto;

public class Account {

    private String name;
    private String phone;
    private String fax;
    private String rating;
    private String accountNum;
    private String website;
    private String type;
    private String ownership;
    private String industry;
    private String sicCode;
    private boolean isTms;
    private boolean isVip;
    private String billingStreet;
    private String shippingStreet;
    private String shippingCountry;

    public Account(String name, String phone, String fax,
                   String rating, String accountNum, String website,
                   String type, String ownership, String industry,
                   String sicCode, boolean isTms, boolean isVip,
                   String billingStreet, String shippingStreet, String shippingCountry) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.rating = rating;
        this.accountNum = accountNum;
        this.website = website;
        this.type = type;
        this.ownership = ownership;
        this.industry = industry;
        this.sicCode = sicCode;
        this.isTms = isTms;
        this.isVip = isVip;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.shippingCountry = shippingCountry;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getRating() {
        return rating;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getWebsite() {
        return website;
    }

    public String getType() {
        return type;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getIndustry() {
        return industry;
    }

    public String getSicCode() {
        return sicCode;
    }

    public boolean isTms() {
        return isTms;
    }

    public boolean isVip() {
        return isVip;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }
}
