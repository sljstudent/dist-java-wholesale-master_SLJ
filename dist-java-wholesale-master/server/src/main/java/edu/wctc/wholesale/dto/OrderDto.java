package edu.wctc.wholesale.dto;


import edu.wctc.wholesale.entity.WholesaleOrder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDto {
    private String customerName;
    private String purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private String shippedDate;
    private double productCost;

    public OrderDto(WholesaleOrder order) {
        this.customerName = order.getCustomer().getName();
        this.purchaseDate = order.getPurchaseDate().toString();
        this.purchaseOrderNumber = order.getPurchaseOrderNumber();
        this.productName = order.getProduct().getName();
        this.terms = order.getTerms();
        this.shippedDate = order.getShippedDate() == null
                ? null
                : order.getShippedDate().toString();
        this.productCost = order.getProduct().getCost();
    }
}
