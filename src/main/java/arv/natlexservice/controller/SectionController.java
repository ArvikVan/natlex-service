package arv.natlexservice.controller;

import arv.natlexservice.controller.exception.NoSectionException;
import arv.natlexservice.model.Section;
import arv.natlexservice.repo.SectionRepo;
import arv.natlexservice.service.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
@RestController
@RequestMapping("/api")
public class SectionController {
    @Autowired
    private SectionRepo sectionService;

    @GetMapping("/sections")
    public List<Section> showAllSections() {
        List<Section> allSections = sectionService.findAll();
        return allSections;
    }

    @PostMapping("/sections")
    public Section createSection(@RequestBody Section section) {
        sectionService.save(section);
        return section;
    }

    @GetMapping("/sections/{id}")
    public Section getSectionById(@PathVariable Long id) {
        return sectionService.getById(id);
    }

    @PutMapping("/sections")
    public Section updateSection(@RequestBody Section section) {
        sectionService.save(section);
        return section;
    }

    @DeleteMapping("/sections/{id}")
    public String deleteSection(@PathVariable Long id) {
        Section section = sectionService.getById(id);
        if (section == null) {
            throw new NoSectionException("No section with id " + id + "in db");
        }
        sectionService.deleteById(id);
        return "Section with id " + id + " deleted";
    }

}
