package com.javanauta.usuario.infrastrucure.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua")
    String rua;
    @Column(name = "numero")
    String numero;
    @Column(name = "complemento", length = 10)
    String complemento;
    @Column(name = "cidade", length = 150)
    String cidade;
    @Column(name = "estado", length = 2)
    String estado;
    @Column(name = "cep", length = 9)
    String cep;

}
