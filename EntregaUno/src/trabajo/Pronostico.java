package trabajo;


public class Pronostico {

	private Partido partido;
	private Equipo equipo;
	private Resultado resultado;
	 
	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public int puntos() {		
	
	 if (this.partido.calcularResultado(equipo) == this.resultado) {
		 return 1;
	 }
	 return 0;
	}
}
