package br.com.zup.casadocodigo.autores;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = { EmailUnicoValidator.class })
@Target({ FIELD, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface EmailUnico {

    String message() default "{email.unico}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
