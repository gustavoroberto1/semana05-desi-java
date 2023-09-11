package Models;

import Enums.TipoTransacao;
import java.util.Date;
import java.util.UUID;

public class Transacao {

    private final UUID id;
    private final Date data;
    private final double valor;
    private final UUID contaId;
    private final TipoTransacao tipo;

    public Transacao(double valor, UUID contaId, TipoTransacao tipo) {
        this.valor = valor;
        this.contaId = contaId;
        this.tipo = tipo;
        this.id = UUID.randomUUID();
        this.data = new Date();
    }

    public Transacao(UUID id, Date data, double valor, UUID contaId, TipoTransacao tipo) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.contaId = contaId;
        this.tipo = tipo;
    }
    
    public UUID getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public UUID getContaId() {
        return contaId;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

}
