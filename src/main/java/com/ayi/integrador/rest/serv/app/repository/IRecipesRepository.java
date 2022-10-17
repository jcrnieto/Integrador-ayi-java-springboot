package com.ayi.integrador.rest.serv.app.repository;

import com.ayi.integrador.rest.serv.app.entity.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IRecipesRepository extends JpaRepository<Recipes, Long> {

    @Query(value = "select u from  Recipes u where u.title like  %?1% ")
    List<Recipes> findByTitle(String title);
}
