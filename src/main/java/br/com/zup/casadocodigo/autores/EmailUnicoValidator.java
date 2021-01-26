package br.com.zup.casadocodigo.autores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class EmailUnicoValidator implements ConstraintValidator<EmailUnico, String> {


    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void initialize(EmailUnico anotacao) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext contextoDeValidacao) {
        // vericar no banco de dados
        // se tiver um email igual -> deu ruim na validacao
        // senao deu bom na validacao

        boolean existe = autorRepository.existsByEmail(email);

        if (existe) {
            return false;
        }

        return true;
    }
}
