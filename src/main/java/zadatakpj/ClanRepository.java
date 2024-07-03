package zadatakpj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ClanRepository extends JpaRepository<Clan, Integer> {

    List<Clan> findAll();

    Optional<Clan> findById(Integer id);

}
