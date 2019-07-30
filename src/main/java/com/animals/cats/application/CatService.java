package com.animals.cats.application;

import com.animals.cats.application.models.Cat;
import com.animals.cats.application.models.DbCat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class CatService {

    private final CatRepository catRepository;

    Cat findById(Long id) {
        return Cat.toDto(catRepository.getOne(id));
    }

    List<Cat> findAll() {
        return catRepository.findAll()
                .stream()
                .map(Cat::toDto)
                .collect(Collectors.toList());
    }

    Cat save(Cat cat) {
        return Cat.toDto(catRepository.save(Cat.toDao(cat)));
    }

    Cat update(Long id, Cat cat) {
        Cat updatedCat = findById(id);
        if(updatedCat != null) {
            cat.setId(updatedCat.getId());
        }
        return save(cat);
    }

    Cat cuteFight(long firstCatId, long secondCatId) {
        DbCat firstCat = catRepository.findById(firstCatId).get();
        DbCat secondCat = catRepository.findById(secondCatId).get();
        if ("GREEN".equals(firstCat.getEyeColor()) && "BLUE".equals(secondCat.getEyeColor())) {
            return Cat.toDto(secondCat);
        }
        if (firstCat.getBirthDate() != null && secondCat.getBirthDate() != null
                && firstCat.getBirthDate().isBefore(secondCat.getBirthDate())) {
            return Cat.toDto(secondCat);
        }
        if ("GREEN".equals(secondCat.getEyeColor()) && !"GREEN".equals(firstCat.getEyeColor())
                && secondCat.getBirthDate().isAfter(LocalDate.now().minusYears(1))) {
            return Cat.toDto(secondCat);
        }
        if (secondCat.getWeight() < firstCat.getWeight()) {
            return Cat.toDto(secondCat);
        }
        if ("BLACK".equals(firstCat.getFurColor()) && !("BlACK".equals(secondCat.getFurColor()))) {
            return Cat.toDto(firstCat);
        }
        return Cat.toDto(firstCat);
    }

    void deleteOne(Long id) {
        catRepository.deleteById(id);
    }

    void deleteAll() {
        catRepository.deleteAll();
    }
}