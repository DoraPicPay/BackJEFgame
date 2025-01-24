package J.FGAME.Viviane.adpater.controller;

import J.FGAME.Viviane.application.domain.Informations;
import J.FGAME.Viviane.application.usecase.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/Register")
    public Object Register(@RequestBody Informations info){
       return service.Register(info);
    }

    @PostMapping("/Login")
    public Object Login(@RequestBody Informations info){
        return service.Login(info);
    }

    @PostMapping("/SetScore")
    public Object SetScore(@RequestBody Informations info){
        System.out.println(service.SetScore(info));
        return service.SetScore(info);
    }
}
