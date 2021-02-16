package com.airesribeiro.pessoas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airesribeiro.pessoas.model.Pessoa;

@RestController
@RequestMapping("/Pessoa")
public class PessoaRest {
	@Autowired // Insere uma instância da classe PessoaDao
	private PessoaDao pessoaDao;
	
	@GetMapping // expõe o método get
	public List<Pessoa> lista (){	
		return pessoaDao.findAll();
	}
	
	@PostMapping // expõe o método post
	public void post (@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable ("id") Long id) {
		pessoaDao.deleteById(id);
	}

}
