package com.joao.vendas.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
     private  Integer id;

    @Column(nullable = false,length = 150) // setando posições no nome
     private String nome;
    @Column(nullable = false, length = 11)
     private String cpf;

    @Column(name = "data_cadastro")
    @JsonFormat(pattern =  "dd/MM/yyyy")
     private LocalDate dataCadastro;

    @PrePersist
    public  void prePersist(){
        setDataCadastro(LocalDate.now());
    }

}