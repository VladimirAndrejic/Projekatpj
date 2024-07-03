package zadatakpj;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zadatakpj.Clan;
import zadatakpj.ClanService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clan")
@RequiredArgsConstructor
@CrossOrigin
public class ClanController {

    private final ClanService service;

    @GetMapping
    public List<Clan> getALlClans() {
        return service.getAllClans();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Clan> getClanById(@PathVariable Integer id) {

        return ResponseEntity.of(service.getClanById(id));
    }

    @PostMapping
    public Clan createClan(@RequestBody Clan clan) {
        return service.createClan(clan);
    }

    @PutMapping(path = "/{id}")
    public Clan updateClan(@PathVariable Integer id, @RequestBody Clan clan) {
        return service.editClan(id, clan);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteClan(@PathVariable Integer id) {
        service.deleteClan(id);
    }

}


