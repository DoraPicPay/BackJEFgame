package J.FGAME.Viviane.application.usecase.Methods;

import J.FGAME.Viviane.application.domain.Collection;

import java.util.Optional;

public class MapperClass {
    public static Collection toCollection(Optional<Collection> optional){
        return optional.get();
    }
}
