package online.akzholedu.kz.mamandyq.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_specialities")
public class Specialities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private String salary;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Universities> universities;

    @ManyToOne(fetch = FetchType.EAGER)
    private PairSubjects subjects;
}
