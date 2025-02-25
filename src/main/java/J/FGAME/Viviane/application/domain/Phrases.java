package J.FGAME.Viviane.application.domain;

public class Phrases {
    String valor;
    String certa;
    String erradaUm;
    String erradaDois;
    String errdadaTres;

    @Override
    public String toString() {
        return "Phrases{" +
                "valor='" + valor + '\'' +
                ", certa='" + certa + '\'' +
                ", erradaUm='" + erradaUm + '\'' +
                ", erradaDois='" + erradaDois + '\'' +
                ", errdadaTres='" + errdadaTres + '\'' +
                '}';
    }

    public String getValor() {
        return valor;
    }

    public String getCerta() {
        return certa;
    }

    public String getErradaUm() {
        return erradaUm;
    }

    public String getErradaDois() {
        return erradaDois;
    }

    public String getErrdadaTres() {
        return errdadaTres;
    }
}
