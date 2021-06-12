package az.code.unisubapp.dto;

import az.code.unisubapp.models.Card;
import az.code.unisubapp.models.Subscription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDto {
    private Long id;
    private String item;
    private String plan;
    private BigDecimal price;
    private Long cardId;
    private LocalDate subDate;
    private LocalDate renewDate;
    private URL website;
    private boolean isDeactivated;

    public SubscriptionDto(Subscription sub) {
        this.id = sub.getId();
        this.item = sub.getItem();
        this.plan = sub.getPlan();
        this.price = sub.getPrice();
        this.cardId = sub.getCard().getId();
        this.subDate = sub.getSubDate();
        this.renewDate = sub.getRenewDate();
        this.website = sub.getWebsite();
        this.isDeactivated = sub.isDeactivated();
    }
}
