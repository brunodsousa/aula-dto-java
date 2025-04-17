package br.com.brunosousa.aula.repositories;

import br.com.brunosousa.aula.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
