package api.video_plataform.domain.administrador;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAdministrador(
        @NotNull
        Long id,
        String nome,
        String email,
        String senha,

        Boolean ativo
) {
}
