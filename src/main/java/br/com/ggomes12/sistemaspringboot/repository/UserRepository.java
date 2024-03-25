package br.com.ggomes12.sistemaspringboot.repository;

import br.com.ggomes12.sistemaspringboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
