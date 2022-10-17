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
    @Lob
    private String title;

    @Column(name="image", nullable = false, length = 50)
    @Lob
    private String image;

    @Column(name="score", nullable = false, length = 50)
    private String score;

    @Column(name="description", nullable = false, length = 50)
    @Lob
    private String description;

    @Column(name="calories", nullable = false, length = 50)
    private Integer calories;

    @ManyToOne
    @JoinColumn(name = "id_diets")
    private Diets diets;


}
 /*@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "tbl_pedidos_productos",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")



@ManyToMany(mappedBy = "productos")
)*/