package arv.natlexservice.service;

import arv.natlexservice.model.Section;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
public interface SectionService {
    Section createSection(Section section);
    Section getSection(String name);
    void updateSection(String name, Section section);
    void deleteSection(String name);
}
