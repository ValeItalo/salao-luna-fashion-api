package lunafashion.api.salonServices;

public record RetrieveSalonServiceRecord(Long id, String descricao, String preco) {

    public RetrieveSalonServiceRecord(SalonServices salonServices){
        this(salonServices.getId(), salonServices.getDescricao(), salonServices.getPreco());
    }

}
