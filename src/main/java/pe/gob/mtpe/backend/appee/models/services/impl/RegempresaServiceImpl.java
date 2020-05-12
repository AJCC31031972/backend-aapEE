package pe.gob.mtpe.backend.appee.models.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.mtpe.backend.appee.models.dao.IRegempresaDao;
import pe.gob.mtpe.backend.appee.models.entity.Regempresa;
import pe.gob.mtpe.backend.appee.models.services.IRegempresaService;

import java.util.List;

@Service
public class RegempresaServiceImpl implements IRegempresaService {

    @Autowired
    private IRegempresaDao regempresaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Regempresa> findAll() {
        return (List<Regempresa>) regempresaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Regempresa findById(Long id) {
        return regempresaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Regempresa save(Regempresa regempresa) {
        return regempresaDao.save(regempresa);
    }

    @Override
    @Transactional
    public void delete(long id) {
        regempresaDao.deleteById(id);
    }
}