package trabajo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Entrega1 {

	public static void main(String[] args) {

		Ronda ronda = new Ronda();
		ronda.setNumero(1);

		List<String> lineas = null;

		try {
			lineas = Files.readAllLines(Paths.get("E:\\Mis cosas\\Programación\\Entrega1resultados.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (lineas != null) {
			Partido[] partidos = new Partido[lineas.size()];
			for (int i = 0; i < lineas.size(); i++) {

				String[] datos = lineas.get(i).split(";");
				Equipo equipoUno = new Equipo();
				equipoUno.setNombre(datos[0]);
				Equipo equipoDos = new Equipo();
				equipoDos.setNombre(datos[2]);
				Partido partido = new Partido(equipoUno, equipoDos, Integer.parseInt(datos[1]),
						Integer.parseInt(datos[1]));
				partidos[i] = partido;
				ronda.setPartidos(partidos);

			}
		}
		List<String> lineasPronostico = null;
		Pronostico[] pronosticos = null;

		try {
			lineasPronostico = Files.readAllLines(Paths.get("E:\\Mis cosas\\Programación\\Entrega1Pronosticos.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (lineasPronostico != null) {
			pronosticos = new Pronostico[lineasPronostico.size()];
			for (int i = 0; i < lineasPronostico.size(); i++) {
				Pronostico pronostico = new Pronostico();
				Equipo equipo = new Equipo();
				String[] datos = lineasPronostico.get(i).split(";");
				if (datos[1].equals("X") || datos[2].equals("X")) {
					equipo.setNombre(datos[0]);
					pronostico.setEquipo(equipo);
					if (datos[1].equals("X")) {
						pronostico.setResultado(Resultado.GANADOR);
					} else {
						pronostico.setResultado(Resultado.EMPATE);
					}

				} else {
					equipo.setNombre(datos[4]);
					pronostico.setResultado(Resultado.GANADOR);
				}
				pronostico.setPartido(ronda.getPartidos()[i]);
				pronosticos[i] = pronostico;
			}
		}
		int suma = 0;
		for (Pronostico pronostico : pronosticos) {
			suma+= pronostico.puntos();
		}
			System.out.println("Puntaje = "+ suma);
		

	}

}
