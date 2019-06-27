package com.animals.cats.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CatService {

    private final CatRepository catRepository;

    Cat findById (Long id) {
        return Cat.toDto(catRepository.getOne(id));
    }

    List<Cat> findAll () {
        return catRepository.findAll()
                .stream()
                .map(Cat::toDto)
                .collect(Collectors.toList());
    }

    Cat save (Cat cat) {
        return Cat.toDto(catRepository.save(Cat.toDb(cat)));
    }

    Cat update (Long id, Cat cat) {
        Cat exisitingCat = findById(id);
        return save(exisitingCat);
    }

    void deleteOne (Long id) {
        catRepository.deleteById(id);
    }

    void deleteAll () {
        catRepository.deleteAll();
    }
}