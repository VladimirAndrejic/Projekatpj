package zadatakpj;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zadatakpj.Knjiga;
import zadatakpj.KnjigaService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/knjiga")
@RequiredArgsConstructor
@CrossOrigin
public class KnjigaController {

    private final KnjigaService service;

    @GetMapping
    public List<Knjiga> getALlKnjiga() {
        return service.getAllKnjiga();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Knjiga> getKnjigaById(@PathVariable Integer id) {

        return ResponseEntity.of(service.getKnjigaById(id));
    }

    @PostMapping
    public Knjiga createKnjiga(@RequestBody Knjiga knjiga) {
        return service.createKnjiga(knjiga);
    }

    @PutMapping(path = "/{id}")
    public Knjiga updateKnjiga(@PathVariable Integer id, @RequestBody Knjiga knjiga) {
        return service.editKnjiga(id, knjiga);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteKnjiga(@PathVariable Integer id) {
        service.deleteKnjiga(id);
    }

}


