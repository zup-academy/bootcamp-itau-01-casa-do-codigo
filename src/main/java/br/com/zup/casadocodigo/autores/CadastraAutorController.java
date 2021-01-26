package br.com.zup.casadocodigo.autores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/autores")
public class CadastraAutorController {


    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    public ResponseEntity<Object> cadastrar(@RequestBody @Valid NovoAutorRequest requisicao) {

        Autor autor = requisicao.paraAutor();

        System.out.println(autor);

        autorRepository.save(autor);

        return ResponseEntity.ok().build();
    }
}
