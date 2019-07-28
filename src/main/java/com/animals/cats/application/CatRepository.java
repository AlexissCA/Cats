package com.animals.cats.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<DbCat, Long> {
    @Transactional
    DbCat findByName(@Param("name") String name);
}
