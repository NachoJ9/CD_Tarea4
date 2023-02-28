package cuentas;

public class CCuenta {


    public static class CCuentaData {
		private String nombre;
		private String cuenta;
		private double saldo;
		private double tipoInterés;

		public CCuentaData() {
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCuenta() {
			return cuenta;
		}

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getTipoInterés() {
			return tipoInterés;
		}

		public void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
	}

	private CCuentaData data = new CCuentaData();

	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        data.setNombre(nom);
        data.setCuenta(cue);
        data.setSaldo(sal);
    }

    public double estado()
    {
        return data.getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        data.setSaldo(data.getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        data.setSaldo(data.getSaldo() - cantidad);
    }
}
