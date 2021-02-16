package com.airesribeiro.pessoas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airesribeiro.pessoas.model.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {
	

}
