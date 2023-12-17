package by.mrkndrvsk.openapigeneratorexample.api.http;

import by.mrkndrvsk.openapigeneratorexample.api.http.model.Pet;
import by.mrkndrvsk.openapigeneratorexample.service.PetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class DefaultPetsApiDelegate implements PetsApiDelegate {

    private final PetsService petsService;

    @Override
    public ResponseEntity<Void> createPets(Set<Pet> pets) {
        petsService.createPets(pets);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Set<Pet>> listPets(Integer limit) {
        return ResponseEntity.ok()
                .body(petsService.listPets(limit));
    }

    @Override
    public ResponseEntity<Pet> showPetById(Long petId) {
        return ResponseEntity.ok()
                .body(petsService.showPetById(petId));
    }
}
