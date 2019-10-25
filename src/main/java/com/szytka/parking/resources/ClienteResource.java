package com.szytka.parking.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.szytka.parking.domain.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cliente> listar() {
		
		Cliente cat = new Cliente(1,"Joao");
		Cliente cat2 = new Cliente(2,"Jose");
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cat);
		lista.add(cat2);
		
		return lista;
		
	}
	

}
