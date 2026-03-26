package org.example.coursework3.dto;

import lombok.Data;

@Data
public class PricingQuoteRequest {
    private String specialistId;
    private Integer duration;
    private String type;
}
