package arv.natlexservice.controller;

import arv.natlexservice.model.Section;
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
    private SectionServiceImpl sectionService;

    @PostMapping("/sections")
   public ResponseEntity<Section> createSection(@RequestBody Section section) {
        return new ResponseEntity<>(this.sectionService.createSection(section),HttpStatus.CREATED);
    }

}
