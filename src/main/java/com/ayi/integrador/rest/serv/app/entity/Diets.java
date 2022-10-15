package com.ayi.integrador.rest.serv.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="diets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_diets")
    private Long idDiets;

    @Column(name="type_of_diet", nullable = false, length = 50)
    private String typeOfDiet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipes_fk", referencedColumnName = "id_recipes")
    private List<Recipes> recipes;

}
