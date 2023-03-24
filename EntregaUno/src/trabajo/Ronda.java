package trabajo;


public class Ronda {
	private Partido[] partidos;
	private Integer numero;
	

	public Partido[] getPartidos() {
		return partidos;
	}


	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public int puntosPorRonda () {
	return 1;
	}

}
