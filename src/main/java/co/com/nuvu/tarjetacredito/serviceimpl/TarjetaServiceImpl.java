package co.com.nuvu.tarjetacredito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.nuvu.tarjetacredito.entity.TarjetaEntity;
import co.com.nuvu.tarjetacredito.repository.TarjetaRepository;
import co.com.nuvu.tarjetacredito.service.TarjetaService;

@Service
public class TarjetaServiceImpl implements TarjetaService {
	
	@Autowired
	private TarjetaRepository tarjetaRepository;
	

	@Override
	public TarjetaEntity getUsuario(Long identificacion) {
		return tarjetaRepository.findById(identificacion).isPresent()?
				tarjetaRepository.findById(identificacion).orElseThrow(null):null;
	}

	@Override
	public List<TarjetaEntity> getUsuarios() {
		return (List<TarjetaEntity>) tarjetaRepository.findAll();
	}

	@Override
	public TarjetaEntity crearUsuario(TarjetaEntity tarjetaEntity) {
		return tarjetaRepository.save(tarjetaEntity);
	}

	@Override
	public TarjetaEntity modificarUsuario(TarjetaEntity tarjetaEntity) {
		return tarjetaRepository.findById(tarjetaEntity.getIdentificacion()).isPresent()?
				tarjetaRepository.save(tarjetaEntity):null;
	}

	@Override
	public void eliminarUsuario(Long identificacion) {
		tarjetaRepository.deleteById(identificacion);
		
	}

}
