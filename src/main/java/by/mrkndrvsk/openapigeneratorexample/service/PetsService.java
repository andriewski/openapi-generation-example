package by.mrkndrvsk.openapigeneratorexample.service;

import by.mrkndrvsk.openapigeneratorexample.api.http.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class PetsService {

    public void createPets(Set<Pet> pets) {
        log.info("Creating pets {}", pets);
    }

    public Set<Pet> listPets(Integer limit) {
        return Set.of(new Pet(1L, "lorry"), new Pet(2L, "howdy"));
    }

    public Pet showPetById(Long petId) {
        return new Pet(petId, "lorry");
    }
}
