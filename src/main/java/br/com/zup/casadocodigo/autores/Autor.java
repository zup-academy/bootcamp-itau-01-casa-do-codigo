package br.com.zup.casadocodigo.autores;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.StringJoiner;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    @Size(max = 400)
    private String descricao;
    private LocalDateTime criadoEm = LocalDateTime.now(); // Instante de criacao

    public Autor() { }

    public Autor(String nome, String email, String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Autor.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("email='" + "aaa@bbb.com" + "'")
                .add("descricao='" + descricao + "'")
                .add("criadoEm=" + criadoEm)
                .toString();
    }
}
