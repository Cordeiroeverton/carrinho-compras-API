package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import me.dio.sacola.enumeration.FormaPagamento;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Sacola {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    @ToString.Exclude
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento formaPagamento;
    private boolean fechada;

}
