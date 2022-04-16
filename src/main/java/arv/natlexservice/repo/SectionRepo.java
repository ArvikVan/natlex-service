package arv.natlexservice.repo;

import arv.natlexservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
public interface SectionRepo extends JpaRepository<Section, Long> {
    Section getSectionByGeologicalClass(String code);
    Section findByName(String name);
    Section deleteByName(String name);
}
