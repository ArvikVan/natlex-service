package arv.natlexservice.repo;

import arv.natlexservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
public interface SectionRepo extends JpaRepository<Section, Long> {
    Section findByName(String name);
    List<Section> findAllByName(String name);
    List<Section> findSectionsByGeologicalClassCode(String code);
    Section deleteByName(String name);
}
