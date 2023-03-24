package trabajo;


public class Partido {
	

	
	public Partido(Equipo equipoUno, Equipo equipoDos, int golesEquipoUno, int golesEquipoDos) {
		this.equipoUno = equipoUno;
		this.equipoDos = equipoDos;
		this.golesEquipoUno = golesEquipoUno;
		this.golesEquipoDos = golesEquipoDos;
	}

	public Equipo getEquipoUno() {
		return equipoUno;
	}

	public void setEquipoUno(Equipo equipoUno) {
		this.equipoUno = equipoUno;
	}

	public Equipo getEquipoDos() {
		return equipoDos;
	}

	public void setEquipoDos(Equipo equipoDos) {
		this.equipoDos = equipoDos;
	}

	public int getGolesEquipoUno() {
		return golesEquipoUno;
	}

	public void setGolesEquipoUno(int golesEquipoUno) {
		this.golesEquipoUno = golesEquipoUno;
	}

	public int getGolesEquipoDos() {
		return golesEquipoDos;
	}

	public void setGolesEquipoDos(int golesEquipoDos) {
		this.golesEquipoDos = golesEquipoDos;
	}

	private Equipo equipoUno;
	private Equipo equipoDos;
	private int golesEquipoUno;
	private int golesEquipoDos;
	
	public Resultado calcularResultado(Equipo equipo) {
		
		if (equipoUno.getNombre() == equipo.getNombre()) {
			if (golesEquipoUno > golesEquipoDos) {
				return Resultado.GANADOR;
			}
			if (golesEquipoUno == golesEquipoDos) {
				return Resultado.EMPATE;
			}
			return Resultado.PERDEDOR;
		}
		if (golesEquipoDos > golesEquipoUno) {
			return Resultado.GANADOR;
		}
		if (golesEquipoDos == golesEquipoUno) {
			return Resultado.EMPATE;
		}
		return Resultado.PERDEDOR;
	}
	
	
}
