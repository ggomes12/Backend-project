package br.com.ggomes12.sistemaspringboot.controller;

import br.com.ggomes12.sistemaspringboot.dto.UserDTO;
import br.com.ggomes12.sistemaspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> listAll() {
        return userService.listAll();
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody UserDTO user) {
        userService.insert(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

}
