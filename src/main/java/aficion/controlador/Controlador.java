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
	    modelAndView.setViewName("index"); 
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
		return modelAndView;
	}

	
	@RequestMapping(value="/modificar",method=RequestMethod.GET, params = {"id"})
	public ModelAndView prueba(@RequestParam("id") String id) {
		Aficiones aficiones = null;
		aficiones = saAficion.getById(id);
		ModelAndView modelAndView = new ModelAndView();
		TransferAficiones transferAficiones = TransferAficiones.EntityToTransfer(aficiones);
		modelAndView.addObject("transferAficiones", transferAficiones);
		modelAndView.setViewName("modificar");
		return modelAndView;		
	}
	
	
	
	@RequestMapping(value="/modificar",method=RequestMethod.POST)
	public ModelAndView modif(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		ModelAndView modelAndView =new ModelAndView();
		Aficiones aficiones = saAficion.getById(transferAficiones.getId());
		aficiones.setId(transferAficiones.getId());
		aficiones.setTema(transferAficiones.getTema());
		aficiones.setApodo(transferAficiones.getApodo());
		aficiones.setNombre(transferAficiones.getNombre());
		aficiones.setPuntuacion(transferAficiones.getPuntuacion());
		aficiones.setPrecio(transferAficiones.getPrecio());
		saAficion.insertarAficion(transferAficiones);
		modelAndView.addObject("transferAficiones", transferAficiones);
		modelAndView.setViewName("index");
		//modelAndView = new ModelAndView("redirect:/index");
		return modelAndView;		
	}
	
	

	@RequestMapping(value="/verCambio",method=RequestMethod.GET, params = {"id"})
	public ModelAndView verCambio(@RequestParam("id") String id) {
		ModelAndView modelAndView = new ModelAndView();
		//Aficiones aficiones = saAficion.getById(transferAficiones.getId());
		//TransferAficiones tAficiones = new TransferAficiones(transferAficiones.getId(), transferAficiones.getTema(), transferAficiones.getApodo(), transferAficiones.getNombre(), transferAficiones.getPuntuacion(), transferAficiones.getPrecio());
		
	//	modelAndView.addObject("transferAficiones", tAficiones);
		
	
		//modelAndView.addObject("transferAficiones", TransferAficiones.EntityToTransfer(aficiones));
		modelAndView.setViewName("verDetallesAficion");
		return modelAndView;		
	}

	
	
	@RequestMapping(value="/eliminar",method=RequestMethod.GET, params = {"id"})
	public ModelAndView eliminar(@RequestParam("id") String id) {
		ModelAndView modelAndView = new ModelAndView();
		saAficion.eliminar(id);
		modelAndView.setViewName("index");
		return modelAndView;		
	}
	
	
	/*@RequestMapping(value="/mostrarTodos", method=RequestMethod.GET)
	public ModelAndView mostrarTodos(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		
		modelAndView.addObject("listaAficiones", saAficion.buscarTodosLosTemas(transferAficiones.getId()));
		//modelAndView.addObject("listaAficiones", saAficion.buscarTodosLosTemas());
		//modelAndView = new ModelAndView("redirect:/mostrarTodos");
		modelAndView.setViewName("mostrarBusqueda");
		return modelAndView;
	}*/
	
	/*@RequestMapping(value="/mostrarTodos",method=RequestMethod.POST)
	public ModelAndView mostrarTodasAficiones(@ModelAttribute("transferAficiones") @Valid Aficiones transferAficiones) {
		ModelAndView modelAndView = new ModelAndView();
		List<Aficiones> listaAficiones =saAficion.buscarTodosLosTemas();		
		modelAndView.addObject("listaAficionesTema", listaAficiones);
		modelAndView.setViewName("mostrarBusqueda");		
		return modelAndView;
	}
*/
}
