package pe.gob.mtpe.backend.appee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.gob.mtpe.backend.appee.models.entity.Regempresa;
import pe.gob.mtpe.backend.appee.models.services.IRegempresaService;

import java.util.List;

@CrossOrigin( origins = {"http://localhost:4200"} )
@RestController
@RequestMapping("/api")
public class RegempresaController {

    @Autowired
    private IRegempresaService regempresaService;

    @GetMapping("/regempresas")
    public List<Regempresa> index(){
        return regempresaService.findAll();
    }

    @GetMapping("/regempresas/{id}")
    public Regempresa show(@PathVariable long id){
        return regempresaService.findById(id);
    }

    @PostMapping("/regempresas")
    @ResponseStatus(HttpStatus.CREATED)
    public Regempresa create(@RequestBody Regempresa regempresa){
        return regempresaService.save(regempresa);
    }
}
