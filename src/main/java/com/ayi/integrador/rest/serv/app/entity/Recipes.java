package com.ayi.integrador.rest.serv.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_recipes")
    private Long idRecipes;

    @Column(name="title", nullable = false, length = 50)
    private String title;

    @Column(name="image", nullable = false, length = 50)
    private String image;

    @Column(name="score", nullable = false, length = 50)
    private String score;

    @Column(name="description", nullable = false, length = 50)
    private String description;

    @Column(name="calories", nullable = false, length = 50)
    private Integer calories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "diets_fk", referencedColumnName = "id_diets")
    private List<Diets> diets;


}
