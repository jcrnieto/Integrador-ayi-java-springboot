package com.ayi.integrador.rest.serv.app.repository;

import com.ayi.integrador.rest.serv.app.entity.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecipesRepository extends JpaRepository<Recipes, Long> {
}
