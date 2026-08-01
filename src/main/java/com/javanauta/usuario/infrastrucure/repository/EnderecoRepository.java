package com.javanauta.usuario.infrastrucure.repository;


import com.javanauta.usuario.infrastrucure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {


}