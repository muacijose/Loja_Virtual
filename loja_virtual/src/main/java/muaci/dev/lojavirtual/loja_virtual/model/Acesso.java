package muaci.dev.lojavirtual.loja_virtual.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Objects;

@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
public class Acesso implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private long id;
    @Column(nullable = false)
    private String descricao;
    @Override
    public String getAuthority() {
        return this.descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Acesso acesso)) return false;
        return getId() == acesso.getId() && Objects.equals(getDescricao(), acesso.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescricao());
    }
}
