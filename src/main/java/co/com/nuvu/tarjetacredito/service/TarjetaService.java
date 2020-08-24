package co.com.nuvu.tarjetacredito.service;

import java.util.List;

import co.com.nuvu.tarjetacredito.entity.TarjetaEntity;

public interface TarjetaService {
	
	public TarjetaEntity getUsuario(Long identificacion);
	
	public List<TarjetaEntity> getUsuarios();
	
	public TarjetaEntity crearUsuario(TarjetaEntity tarjetaEntity);
	
	public TarjetaEntity modificarUsuario(TarjetaEntity tarjetaEntity);
	
	public void eliminarUsuario(Long identificacion);

}
