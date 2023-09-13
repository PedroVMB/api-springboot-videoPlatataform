package api.video_plataform.domain.professor;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProfessor(
        @NotNull
        Long id,
        String nome,
        String email,
        String senha,

        Boolean ativo
) {
}
