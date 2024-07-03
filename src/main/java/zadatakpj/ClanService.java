package zadatakpj;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zadatakpj.Clan;
import zadatakpj.ClanRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClanService {

    private final ClanRepository repository;

    public List<Clan> getAllClans(){
        return repository.findAll();
    }

    public Optional<Clan> getClanById(int id){
        return repository.findById(id);
    }

    public Clan createClan(Clan clan){
        clan.setId(null);
        return repository.save(clan);
    }

    public Clan editClan(Integer id, Clan clan) {
        clan.setId(id);
        return repository.save(clan);
    }

    public void deleteClan(Integer id) {
        Clan clan = repository.findById(id).orElseThrow();

        repository.save(clan);
    }
}