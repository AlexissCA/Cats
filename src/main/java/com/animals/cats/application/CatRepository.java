package com.animals.cats.application;

import com.animals.cats.application.models.DbCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<DbCat, Long> {
}
