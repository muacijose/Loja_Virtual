package muaci.dev.lojavirtual.loja_virtual.model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNAscimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNAscimento() {
        return dataNAscimento;
    }

    public void setDataNAscimento(Date dataNAscimento) {
        this.dataNAscimento = dataNAscimento;
    }



}
