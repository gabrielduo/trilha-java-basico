package edu.segundasemana.desafio;

public interface ReprodutorMusical extends Dispositivo {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}