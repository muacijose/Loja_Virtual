package muaci.dev.lojavirtual.loja_virtual.enums;

public enum StatusContaReceber {
    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    QUITADA("Quitada");

    private String descricao;

    StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

}
