package edu.segundasemana.desafio;

public interface NavegadorInternet extends Dispositivo {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}