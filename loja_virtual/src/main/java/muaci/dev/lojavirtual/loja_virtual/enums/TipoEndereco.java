package muaci.dev.lojavirtual.loja_virtual.enums;

public enum TipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("Entrega");

    private String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString(){
        return this.descricao;
    }


}
