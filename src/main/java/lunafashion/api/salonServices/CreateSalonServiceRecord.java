package lunafashion.api.salonServices;

import jakarta.validation.constraints.NotBlank;

public record CreateSalonServiceRecord(
        @NotBlank
        String descricao,

        String preco) {
}
