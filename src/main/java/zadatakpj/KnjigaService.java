package zadatakpj;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zadatakpj.Knjiga;
import zadatakpj.KnjigaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KnjigaService {

    private final KnjigaRepository repository;

    public List<Knjiga> getAllKnjiga(){
        return repository.findAll();
    }

    public Optional<Knjiga> getKnjigaById(int id){
        return repository.findById(id);
    }

    public Knjiga createKnjiga(Knjiga knjiga){
        knjiga.setId(null);
        return repository.save(knjiga);
    }

    public Knjiga editKnjiga(Integer id, Knjiga knjiga) {
        knjiga.setId(id);
        return repository.save(knjiga);
    }

    public void deleteKnjiga(Integer id) {
        Knjiga knjiga = repository.findById(id).orElseThrow();

        repository.save(knjiga);
    }
}