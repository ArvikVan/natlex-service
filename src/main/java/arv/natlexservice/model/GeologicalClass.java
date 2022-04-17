package arv.natlexservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ArvikV
 * @version 1.0
 * @since 16.04.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GeologicalClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
}
