package arv.natlexservice.service;

import arv.natlexservice.model.GeologicalClass;
import arv.natlexservice.repo.GeologicalClassRepo;
import org.springframework.stereotype.Service;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
@Service
public class GeoClassServiceImpl implements GeoClassService {
    private GeologicalClassRepo geologicalClassRepo;
    @Override
    public GeologicalClass create(GeologicalClass geologicalClass) {
        return geologicalClassRepo.save(geologicalClass);
    }

    @Override
    public GeologicalClass getGeologicalClass(String code) {
        return geologicalClassRepo.getGeologicalClassByCode(code);
    }

    @Override
    public void updateGeoClass(String code, GeologicalClass geologicalClass) {
        geologicalClassRepo.save(geologicalClass);
    }

    @Override
    public void deleteGeoClass(String code, GeologicalClass geologicalClass) {
        geologicalClassRepo.delete(geologicalClass);
    }
}
