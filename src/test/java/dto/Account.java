package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Account {

    private String name;
    @Builder.Default
    private String phone = "";
    private String fax;
    @Builder.Default
    private String rating = "--None--";
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
}
