package api.video_plataform.domain.aluno;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAluno(
        @NotNull
        Long id,
        String nome,
        String email,
        String senha,

        Boolean ativo
) {
}
