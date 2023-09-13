package api.video_plataform.domain.video;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroVideo(
        @NotBlank
        String titulo,

        @NotBlank
        @NotNull
        String url
) {
}
