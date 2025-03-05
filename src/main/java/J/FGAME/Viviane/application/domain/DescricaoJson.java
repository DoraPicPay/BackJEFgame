package J.FGAME.Viviane.application.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescricaoJson {
    @JsonProperty("_id")
    String valor;

    @JsonProperty("descricao")
    String descricao;

    @JsonProperty("imagem")
    String imagem;

    public DescricaoJson(String valor, String descricao, String imagem) {
        this.valor = valor;
        this.descricao = descricao;
        this.imagem = imagem;
    }
}
