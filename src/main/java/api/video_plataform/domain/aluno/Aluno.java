package api.video_plataform.domain.aluno;

import api.video_plataform.domain.professor.DadosAtualizacaoProfessor;
import api.video_plataform.domain.professor.DadosCadastroProfessor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

    private Boolean ativo;

    public Aluno(DadosCadastroAluno dados){
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
    }

    public void atualizarInformacoesAluno(DadosAtualizacaoAluno dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.senha() != null){
            this.senha = dados.senha();
        }
        if(dados.ativo() != null){
            this.ativo = dados.ativo();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
