package br.com.ggomes12.sistemaspringboot.service;

import br.com.ggomes12.sistemaspringboot.dto.UserDTO;
import br.com.ggomes12.sistemaspringboot.entity.UserEntity;
import br.com.ggomes12.sistemaspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> listAll() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }

    public void insert(UserDTO user) {
        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);
    }

    public UserDTO update(UserDTO user) {
        UserEntity userEntity = new UserEntity(user);
        return new UserDTO(userRepository.save(userEntity));
    }

    public void delete(Long id) {
        UserEntity user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    public UserDTO findById(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }

}
