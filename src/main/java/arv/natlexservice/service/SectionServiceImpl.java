package arv.natlexservice.service;

import arv.natlexservice.model.Section;
import arv.natlexservice.repo.SectionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
@Service
@RequiredArgsConstructor
public class SectionServiceImpl implements SectionService {
    private SectionRepo sectionRepo;
    @Override
    public Section createSection(Section section) {
        return sectionRepo.save(section);
    }

    @Override
    public Section getSection(String name) {
        return sectionRepo.findByName(name);
    }

    @Override
    public void updateSection(String name, Section section) {
        sectionRepo.save(section);

    }

    @Override
    public void deleteSection(String name) {
        sectionRepo.deleteByName(name);
    }
}
