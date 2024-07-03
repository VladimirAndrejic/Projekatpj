package zadatakpj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface KnjigaRepository extends JpaRepository<Knjiga, Integer> {

    List<Knjiga> findAll();

    Optional<Knjiga> findById(Integer id);

}
