package com.example.rest.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpsertOrderRequest {

    @NotNull(message = "ID клиента должен быть указан!")
    @Positive(message = "ID клиента должен быть больше 0!")
    private Long clientId;

    @NotBlank(message = "Имя продукта должно быть указано!")
    private String product;

    @NotNull(message = "Цена должна быть указана!")
    @Positive(message = "Цена должна быть больше 0!")
    private BigDecimal cost;

}
