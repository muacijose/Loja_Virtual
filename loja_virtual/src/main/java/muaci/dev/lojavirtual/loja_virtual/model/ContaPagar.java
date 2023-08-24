package muaci.dev.lojavirtual.loja_virtual.model;

import jakarta.persistence.*;
import muaci.dev.lojavirtual.loja_virtual.enums.StatusContaReceber;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1,initialValue = 1)
public class ContaPagar implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    private Long id;

    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusContaReceber status;
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;
    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private  Pessoa pessoa;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_forn_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_forn_fk"))
            private  Pessoa pessoa_fornecedor;

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Pessoa getPessoa_fornecedor() {
        return pessoa_fornecedor;
    }

    public void setPessoa_fornecedor(Pessoa pessoa_fornecedor) {
        this.pessoa_fornecedor = pessoa_fornecedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusContaReceber getStatus() {
        return status;
    }

    public void setStatus(StatusContaReceber status) {
        this.status = status;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDEsconto() {
        return valorDesconto;
    }

    public void setValorDEsconto(BigDecimal valorDEsconto) {
        this.valorDesconto = valorDEsconto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContaPagar that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
