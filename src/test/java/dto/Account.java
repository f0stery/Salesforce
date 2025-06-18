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
    @Builder.Default
    private String fax = "";
    @Builder.Default
    private String rating = "--None--";
    @Builder.Default
    private String accountNum = "";
    @Builder.Default
    private String website = "";
    @Builder.Default
    private String type = "--None--";
    @Builder.Default
    private String ownership = "--None--";
    @Builder.Default
    private String industry = "--None--";
    @Builder.Default
    private String sicCode = "";
    @Builder.Default
    private boolean isTms = false;
    @Builder.Default
    private boolean isVip = false;
    @Builder.Default
    private String billingStreet = "";
    @Builder.Default
    private String shippingStreet = "";
    @Builder.Default
    private String shippingCountry = "";
}
