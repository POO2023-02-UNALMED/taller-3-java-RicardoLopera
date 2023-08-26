package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public getControl() {
		return control;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff () {
		estado = false;
	}
	public getEstado() {
		return estado;
	}
	public void canalUp() {
		if ( canal>=1 && canal<=120 && estado == true ) {
			canal++;
		}
	}
	public void canalDown() {
		if ( canal >= 1 && canal<= 120 && estado == true ) {
			canal--;
		}
	}
	public void volumenUp() {
		if (volumen >= 0 && volumen <= 7 && estado == true) {
			volumen++;
		}
	}
	public void volumenDown() {
		if ( volumen>=0 && volumen<= 7 && estado == true ) {
			volumen--;
		}
	}
	
}
