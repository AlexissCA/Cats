package com.animals.cats.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/cats")
@RestController
public class CatsRestController {

    private final CatService catService;

    @GetMapping("/id")
    Cat getOne (@PathVariable Long id) {
        return catService.findById(id);
    }

    @GetMapping
    List<Cat> getAll () {
        return catService.findAll();
    }

    @PostMapping
    Cat create (Cat cat){
        return catService.save(cat);
    }

    @PutMapping("/id")
    Cat update (@PathVariable Long id, Cat cat) {
        return catService.update(id, cat);
    }

    @DeleteMapping("/id")
    void deleteOne (@PathVariable Long id) {
        catService.deleteOne(id);
    }

    @DeleteMapping
    void deleteAll () {
        catService.deleteAll();
    }

}
