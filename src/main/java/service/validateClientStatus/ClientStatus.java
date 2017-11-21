package service.validateClientStatus;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by AHernandezS on 4/11/2017.
 */
@XmlRootElement
public class ClientStatus {
    private int monto;
    private String tipoCliente;

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
