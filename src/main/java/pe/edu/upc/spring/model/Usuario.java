package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name="cuentaUsuario", nullable=false, length=11)
	private String cuentaUsuario;
	
	@Column(name="nombresUsuario", nullable=false, length=20)
	private String nombresUsuario;
	
	@Column(name="apellidosUsuario", nullable=false, length=20)
	private String apellidosUsuario;
	
	@Column(name="correoUsuario", nullable=false, length=20)
	private String correoUsuario;
	
	@Column(name="edadUsuario", nullable=false)
	private int edadUsuario;
	
	private char sexo;
	
	@Column(name="telefono", nullable=false, length=9)
	private String telefono;
	
	@Column(name="claveUsuario", nullable=false, length=20)
	private String claveUsuario;
	
	@Column(name= "ubicacion", nullable=false, length=50)
	private String ubicacion;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String cuentaUsuario, String nombresUsuario, String apellidosUsuario,
			String correoUsuario, int edadUsuario, char sexo, String telefono, String claveUsuario, String ubicacion) {
		super();
		this.idUsuario = idUsuario;
		this.cuentaUsuario = cuentaUsuario;
		this.nombresUsuario = nombresUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.correoUsuario = correoUsuario;
		this.edadUsuario = edadUsuario;
		this.sexo = sexo;
		this.telefono = telefono;
		this.claveUsuario = claveUsuario;
		this.ubicacion = ubicacion;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCuentaUsuario() {
		return cuentaUsuario;
	}

	public void setCuentaUsuario(String cuentaUsuario) {
		this.cuentaUsuario = cuentaUsuario;
	}

	public String getNombresUsuario() {
		return nombresUsuario;
	}

	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public int getEdadUsuario() {
		return edadUsuario;
	}

	public void setEdadUsuario(int edadUsuario) {
		this.edadUsuario = edadUsuario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
}
