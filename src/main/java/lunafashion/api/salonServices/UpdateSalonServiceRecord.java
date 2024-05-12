package lunafashion.api.salonServices;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateSalonServiceRecord(@NotNull Long id, @NotBlank String descricao, String preco) {
}
