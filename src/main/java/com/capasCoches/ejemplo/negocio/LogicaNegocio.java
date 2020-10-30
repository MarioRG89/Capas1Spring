package  com.capasCoches.ejemplo.negocio;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capasCoches.ejemplo.datos.IConsultaDatos;

@Component
public class LogicaNegocio implements ICalculaCoches {
	
@Autowired
IConsultaDatos consultaDatos;
@Override
public Integer calculaCoches(String nombre) throws IOException {
	
		Integer cochesTotales=0;
		
		//ConsultaDatos consultaDatos = new ConsultaDatos();
		List<String> datos = consultaDatos.consultaCoches();
		for (String consultaDatos2 : datos) {
			if(consultaDatos2.contentEquals(nombre)) {
				cochesTotales++;
			}
		}
		return cochesTotales;
	}
	
}
