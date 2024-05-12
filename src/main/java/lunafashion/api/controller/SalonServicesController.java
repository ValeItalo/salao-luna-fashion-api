package lunafashion.api.controller;

import jakarta.validation.Valid;
import lunafashion.api.salonServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("salon-services")
public class SalonServicesController {

    @Autowired
    private SalonServicesRepository repository;

    @GetMapping
    public Page<RetrieveSalonServiceRecord> getAllSalonServices(@PageableDefault(sort={"descricao"}) Pageable pagination){
        return repository.findAll(pagination).map(RetrieveSalonServiceRecord::new);
    }

    @PostMapping
    @Transactional
    public void createSalonService(@RequestBody @Valid CreateSalonServiceRecord data) {
        repository.save(new SalonServices(data));
    }

    @PutMapping
    @Transactional
    public void updateSalonService(@RequestBody @Valid UpdateSalonServiceRecord data){
        var salonService = repository.getReferenceById(data.id());
        salonService.update(data);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteSalonService(@PathVariable Long id){
        repository.deleteById(id);
    }
}
