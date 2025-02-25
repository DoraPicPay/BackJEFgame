package J.FGAME.Viviane.application.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "Perguntas")
public class CollectionPhrases {
    @Id
    String _id;
    String certa;
    String erradaUm;
    String erradaDois;
    String erradaTres;

    public CollectionPhrases(String _id, String certa, String erradaUm, String erradaDois, String erradaTres) {
        this._id = _id;
        this.certa = certa;
        this.erradaUm = erradaUm;
        this.erradaDois = erradaDois;
        this.erradaTres = erradaTres;
    }

    @Override
    public String toString() {
        return "CollectionPhrases{" +
                "_id='" + _id + '\'' +
                ", certa='" + certa + '\'' +
                ", erradaUm='" + erradaUm + '\'' +
                ", erradaDois='" + erradaDois + '\'' +
                ", erradaTres='" + erradaTres + '\'' +
                '}';
    }

    public String get_id() {
        return _id;
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

    public String getErradaTres() {
        return erradaTres;
    }
}
