package com.daw2.funkos.models;

import java.math.BigDecimal;

public record Producto(

        Long id,

        String nombre,

        BigDecimal precio,

        String desc,

        Integer unidades

) {}
