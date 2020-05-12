package pe.gob.mtpe.backend.appee.models.services;

import pe.gob.mtpe.backend.appee.models.entity.Regempresa;

import java.util.List;

public interface IRegempresaService {

    public List<Regempresa> findAll();

    public Regempresa findById(Long id);

    public Regempresa save(Regempresa regempresa);

    public void delete(long id);

}
