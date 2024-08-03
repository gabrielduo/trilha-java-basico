package edu.segundasemana.desafio;

public interface AparelhoTelefonico extends Dispositivo {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}