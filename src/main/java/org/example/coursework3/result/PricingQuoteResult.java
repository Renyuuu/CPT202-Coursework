package org.example.coursework3.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricingQuoteResult {
    private double amount;
    private String currency;
    private String detail;
}
