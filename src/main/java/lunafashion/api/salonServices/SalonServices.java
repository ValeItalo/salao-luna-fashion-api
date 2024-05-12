package lunafashion.api.salonServices;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "servicos")
@Entity(name = "SalonServices")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class SalonServices {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String preco;

    public SalonServices(CreateSalonServiceRecord data) {
        this.descricao = data.descricao();
        this.preco = data.preco();
    }

    public void update(UpdateSalonServiceRecord data) {
        if(data.descricao() != null){
            this.descricao = data.descricao();
        }
        if(data.preco() != null){
            this.preco = data.preco();
        }
    }
}
