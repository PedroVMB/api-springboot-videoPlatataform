package api.video_plataform.domain.administrador;

import api.video_plataform.domain.aluno.Aluno;

public record DadosDetalhamentoAdministrador(Long id, String nome, String email, String senha, Boolean ativo) {
    public DadosDetalhamentoAdministrador(Administrador administrador){
        this(administrador.getId(), administrador.getNome(), administrador.getEmail(), administrador.getSenha(), administrador.getAtivo());
    }
}
