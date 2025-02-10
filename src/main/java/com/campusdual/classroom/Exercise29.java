package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Esta es una excepción controlada en el método main");
        } catch (RuntimeException e) {
            System.out.println("Se ha capturado una excepción: " + e.getMessage());
        }

        System.out.println("El programa ha finalizado de forma controlada");
    }
}

