package com.example;

public class senha {
    public boolean senhaValida(String senha) {
        if (senha.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
