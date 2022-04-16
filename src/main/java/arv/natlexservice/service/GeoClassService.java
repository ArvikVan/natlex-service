package arv.natlexservice.service;

import arv.natlexservice.model.GeologicalClass;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
public interface GeoClassService {
    GeologicalClass create(GeologicalClass geologicalClass);
    GeologicalClass getGeologicalClass(String code);
    void updateGeoClass(String code, GeologicalClass geologicalClass);
    void deleteGeoClass(String code, GeologicalClass geologicalClass);
}
