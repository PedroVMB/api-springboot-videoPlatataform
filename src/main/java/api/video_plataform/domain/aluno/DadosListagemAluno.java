package api.video_plataform.domain.aluno;

import api.video_plataform.domain.professor.Professor;

public record DadosListagemAluno(Long id, String nome, String email, String senha) {
    public DadosListagemAluno(Aluno aluno){
        this(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getSenha());
    }
}
