package api.video_plataform.domain.aluno;

import api.video_plataform.domain.professor.Professor;

public record DadosDetalhamentoAluno(Long id, String nome, String email, String senha, Boolean ativo) {
    public DadosDetalhamentoAluno(Aluno aluno){
        this(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getSenha(), aluno.getAtivo());
    }
}
