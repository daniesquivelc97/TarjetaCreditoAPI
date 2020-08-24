package co.com.nuvu.tarjetacredito.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tarjeta_credito")
public class TarjetaEntity implements Serializable {
	private static final long serialVersionUID = 8113149786455993814L;
	
	@Column(name="numero_tarjeta", nullable=false)
	private Long numeroTarjeta;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Id
	@Column(name="identificacion")
	private Long identificacion;

	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "TarjetaEntity [numeroTarjeta=" + numeroTarjeta + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", identificacion=" + identificacion + "]";
	}
	

}
