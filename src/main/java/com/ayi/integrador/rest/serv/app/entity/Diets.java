package com.ayi.integrador.rest.serv.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "diets")
    private List<Recipes> recipes = new ArrayList<>();

}

/*@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "tbl_pedidos_productos",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")



@ManyToMany(mappedBy = "productos")
)*/
