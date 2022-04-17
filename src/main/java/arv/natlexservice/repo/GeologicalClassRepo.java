package arv.natlexservice.repo;

import arv.natlexservice.model.GeologicalClass;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
public interface GeologicalClassRepo extends JpaRepository<GeologicalClass, Long> {
    GeologicalClass getGeologicalClassByCode(String code);
}
