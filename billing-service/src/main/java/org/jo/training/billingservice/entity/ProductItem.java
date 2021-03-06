package org.jo.training.billingservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jo.training.billingservice.wrapperclass.ProductWrapper;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long productId;

    @Transient
    private ProductWrapper product;

    private Double price;

    private Double quantity;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  Bill bill;
}
