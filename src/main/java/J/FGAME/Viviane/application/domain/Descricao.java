package J.FGAME.Viviane.application.domain;

import org.springframework.data.annotation.Id;

public class Descricao {
    @Id
    String valor;
    String descricao;
    String imagem;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Descricao{" +
                "valor='" + valor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", urlImagem='" + imagem + '\'' +
                '}';
    }
}
