package taxi.service.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import taxi.service.dao.ManufacturerDao;
import taxi.service.lib.Inject;
import taxi.service.lib.Service;
import taxi.service.model.Manufacturer;
import taxi.service.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Inject
    private ManufacturerDao manufacturerDao;

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return manufacturerDao.create(manufacturer);
    }

    @Override
    public Manufacturer get(Long id) {
        return manufacturerDao.get(id).orElseThrow(() ->
            new NoSuchElementException("Can't get manufacturer by id: " + id)
        );
    }

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerDao.getAll();
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return manufacturerDao.update(manufacturer);
    }

    @Override
    public boolean delete(Long id) {
        return manufacturerDao.delete(id);
    }
}
