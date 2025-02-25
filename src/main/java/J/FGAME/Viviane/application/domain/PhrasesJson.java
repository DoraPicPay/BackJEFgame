package J.FGAME.Viviane.application.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhrasesJson {
    @JsonProperty("valor") //O name do Json
    private String valor;  //Vai ser a String name

    @JsonProperty("certa")
    private String certa;

    @JsonProperty("erradaUm")
    private String erradaUm;

    @JsonProperty("erradaDois")
    private String erradaDois;

    @JsonProperty("erradaTres")
    private String erradaTres;

    public PhrasesJson(String valor, String certa, String erradaUm, String erradaDois, String erradaTres) {
        this.valor = valor;
        this.certa = certa;
        this.erradaUm = erradaUm;
        this.erradaDois = erradaDois;
        this.erradaTres = erradaTres;
    }
}
