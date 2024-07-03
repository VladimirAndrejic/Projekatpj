package zadatakpj;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "knjiga")
@NoArgsConstructor
@Getter
@Setter
public class Knjiga{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knjiga_id")
    private Integer id;

    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String pisac;

    @Column(nullable = false)
    private String zanr;


}
