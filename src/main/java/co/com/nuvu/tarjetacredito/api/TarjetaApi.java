package co.com.nuvu.tarjetacredito.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.nuvu.tarjetacredito.entity.TarjetaEntity;
import co.com.nuvu.tarjetacredito.service.TarjetaService;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/usuarios")
public class TarjetaApi {
	
	@Autowired
	private TarjetaService tarjetaService;
	
	@GetMapping
	public List<TarjetaEntity> getUsuarios() {
		return tarjetaService.getUsuarios();
	}
	
	@GetMapping("/{identificacion}")
	public TarjetaEntity getUsuario(@PathVariable("identificacion") Long identificacion) {
		return tarjetaService.getUsuario(identificacion);
	}
	
	@PostMapping(produces="application/json")
	public TarjetaEntity crearUsuario(@RequestBody TarjetaEntity tarjetaEntity) {
		return tarjetaService.crearUsuario(tarjetaEntity);
	}
	
	@PutMapping(produces="application/json")
	public TarjetaEntity modificarUsuario(@RequestBody TarjetaEntity tarjetaEntity) {
		return tarjetaService.modificarUsuario(tarjetaEntity);
	}
	
	@DeleteMapping("/{identificacion}")
	public void eliminarUsuario(@PathVariable("identificacion") Long identificacion) {
		tarjetaService.eliminarUsuario(identificacion);
	}

}
