package aficion.controlador;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import aficion.SA.SaAficiones;
import aficion.entidad.Aficiones;
import aficion.transfer.TransferAficiones;



@SpringBootApplication
@Controller
public class Controlador  {


@Autowired
private SaAficiones saAficion ;

	
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView mostrarIndex() {
		ModelAndView modelAndView = new ModelAndView();
		
	
	modelAndView.setViewName("index"); //Nombre de html
	return modelAndView;
	}
	
	
	@RequestMapping(value="/insertar", method=RequestMethod.GET)
	public ModelAndView mostrarInsertar() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("transferAficiones", new Aficiones());
		modelAndView.setViewName("insertar");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	public ModelAndView insertarDatos(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		ModelAndView modelAndView = null;
		saAficion.insertarAficion(transferAficiones);
		modelAndView = new ModelAndView("redirect:/index");
		return modelAndView;
		
		
	}
	
	
	

	@RequestMapping(value="/buscarTema", method=RequestMethod.GET)
	public ModelAndView mostrarBuscarTema() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("transferAficiones", new Aficiones());
		modelAndView.setViewName("buscar");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/buscarTema",method=RequestMethod.POST)
	public ModelAndView buscarTema(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		ModelAndView modelAndView = new ModelAndView();
		List<Aficiones> listaAficiones = saAficion.buscarTemaAficion(transferAficiones.getTema());	
		
		modelAndView.addObject("listaAficionesTema", listaAficiones);

		modelAndView.setViewName("mostrarBusqueda");
		//modelAndView = new ModelAndView("redirect:/insertar");
		
		return modelAndView;
		
		
	}

	
	@RequestMapping(value="/modificar", method=RequestMethod.GET , params = {"nombre"})
	public ModelAndView mostrarModificar(@RequestParam("nombre") String id) {
			
		Aficiones aficiones = saAficion.buscarPorId(id);
		//Aficiones aficiones = saAficion.buscarPorApodo(apodo);
		//aficiones = saAficion.buscarPorNombre(nombre);
		ModelAndView modelAndView = new ModelAndView();
		TransferAficiones transferAficiones = TransferAficiones.EntityToTransfer(aficiones);
		modelAndView.addObject("transferAficiones", transferAficiones);
		modelAndView.setViewName("modificar");
		return modelAndView;
	}
	
	

	@RequestMapping(value="/eliminar",method=RequestMethod.POST)
	public ModelAndView eliminar(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		ModelAndView modelAndView = null;
		saAficion.insertarAficion(transferAficiones);
		modelAndView = new ModelAndView("redirect:/index");
		return modelAndView;
		
		
	}

}
