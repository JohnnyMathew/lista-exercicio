package com.example;

public class desconto {
    public double calcularDesconto(double valorCompra) {
        if (valorCompra > 100) {
            return valorCompra * 0.10;
        } else {
            return valorCompra * 0.05;
        }
    }
}

