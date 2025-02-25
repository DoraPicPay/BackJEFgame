package J.FGAME.Viviane.application.usecase.Methods;

import J.FGAME.Viviane.application.domain.CollectionPhrases;
import J.FGAME.Viviane.application.domain.Phrases;
import J.FGAME.Viviane.application.domain.PhrasesJson;

public class MapperJson {
    public static PhrasesJson toJson(CollectionPhrases phrases){
        return new PhrasesJson(phrases.get_id(), phrases.getCerta(), phrases.getErradaUm(), phrases.getErradaDois(), phrases.getErradaTres());
    }
}
