package br.com.gs3.servico.repository;

import br.com.gs3.servico.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoy extends JpaRepository<Usuario, Long> {

    Usuario findByLogin(String login);

}
