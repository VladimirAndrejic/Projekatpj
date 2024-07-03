package zadatakpj;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity(name = "clan")
    @NoArgsConstructor
    @Getter
    @Setter
    public class Clan {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "clan_id")
        private Integer id;

        @Column(nullable = false)
        private String ime;

        @Column(nullable = false)
        private String prezime;

        @Column(nullable = false)
        private Integer telefon;

        @Column(nullable = false, unique = true)
        private Integer jmbg;
    }


