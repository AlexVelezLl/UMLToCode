package Modelos;

import java.time.LocalDate;

public class PagoTarjeta implements Pago {

	protected float monto;
	protected String numero;
	protected LocalDate expira;
	protected String propietario;
	protected String banco;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}