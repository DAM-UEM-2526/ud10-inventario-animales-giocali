
public abstract class Mascotas {
	protected String nombrel;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

	public Mascotas(String nombrel, int edad, String estado, String fechaNacimiento) {
		this.nombrel = nombrel;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrel() {
		return nombrel;
	}

	public void setNombrel(String nombrel) {
		this.nombrel = nombrel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
