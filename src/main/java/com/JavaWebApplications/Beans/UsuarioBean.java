package com.JavaWebApplications.Beans;

import java.sql.Date;

public class UsuarioBean {
	
	private String usuario;
    private String clave;
    private String email;
    private int rolId;
    private Date fechaCreacion;
    
    
    
    public UsuarioBean() {
		super();
	}

	public UsuarioBean(String usuario, String clave, String email, int rolId) {
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.rolId = rolId;
        
     }
	
    public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRolId() {
		return rolId;
	}
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
