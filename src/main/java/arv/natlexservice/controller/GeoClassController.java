package arv.natlexservice.controller;

import arv.natlexservice.model.GeologicalClass;
import arv.natlexservice.repo.GeologicalClassRepo;
import arv.natlexservice.service.GeoClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ArvikV
 * @version 1.0
 * @since 17.04.2022
 */
@RestController
@RequestMapping("/api/geo")
public class GeoClassController {
    @Autowired
    private GeologicalClassRepo geoClassService;

    @PostMapping("/geoClassService")
    public GeologicalClass createGeo(@RequestBody GeologicalClass geologicalClass) {
        geoClassService.save(geologicalClass);
        return geologicalClass;
    }
}
