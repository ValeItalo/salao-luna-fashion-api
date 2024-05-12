package lunafashion.api.job;

import jakarta.validation.constraints.NotBlank;

public record CreateSalonServiceRecord(
        @NotBlank
        String descricao,

        String preco) {
}
