package com.capasCoches.ejemplo.Controlador;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capasCoches.ejemplo.negocio.ICalculaCoches;
@Controller
public class Controlador {
	@Autowired
	ICalculaCoches calcCoches;
	@RequestMapping("respuesta")
	public String calculaNumCoches(@RequestParam("nombre") String nombreRecibido,ModelMap model) {
		try {
			Integer numCoch=calcCoches.calculaCoches(nombreRecibido);
			model.addAttribute("numeroCoches",numCoch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "respuesta";
		
	}
}
