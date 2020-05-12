package pe.gob.mtpe.backend.appee.models.dao;

import org.springframework.data.repository.CrudRepository;
import pe.gob.mtpe.backend.appee.models.entity.Regempresa;

public interface IRegempresaDao extends CrudRepository<Regempresa, Long> {

}
