package com.animals.cats.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/cats")
@RestController
public class CatRestController {

    private final CatService catService;

    @GetMapping("/id")
    public Cat getOne (@PathVariable Long id) {
        return catService.findById(id);
    }

    @GetMapping
    public List<Cat> getAll () {
        return catService.findAll();
    }

    @PostMapping
    public Cat create (@RequestBody Cat cat){
        return catService.save(cat);
    }

    @PutMapping("/id")
    public Cat update (@PathVariable Long id, @RequestBody Cat cat) {
        return catService.update(id, cat);
    }

    @DeleteMapping("/id")
    public void deleteOne (@PathVariable Long id) {
        catService.deleteOne(id);
    }

    @DeleteMapping
    public void deleteAll () {
        catService.deleteAll();
    }

}
