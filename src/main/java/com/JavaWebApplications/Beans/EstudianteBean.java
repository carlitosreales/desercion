package com.JavaWebApplications.Beans;

public class EstudianteBean {
	
	private int id;
    private int edad;
    private String sexo;
    private String estadoCarrera;
    private String estadoCivil;
    private String horarioDeseado;
    private int semestre;
    private String puntajeIcfes;
    private String recurso;
    private int estrato;
    private int edadPresentacionIcfes;
    private String ocupacion;
    private String descripcionFamiliar;
    private String ciudadDeProcedencia;
    private String nivelEducativo;
    private int interesVocacional;
    private int proyeccionProfesional;
    private int conocimientoDeSiMismo;
    private int capacidadComunicativa;
    private int comportamientoEntrevista;
    private String perdidaDeCursoColegio;
    private String homologacion;
    private String matricula;
    private int apoyoFamiliarEconomico;
    private String numeroHermanos;
    private String posicionDentroHermanos;
    private String recomiendaAdmision;
    private String seguimientoPae;
    private String cargaAcademica;
    private String riesgoAcademico;
    private String temaDeAtencion;
    private String canalLlegada;
    private String riesgosInstitucionales;
    private int actividadesExtracurriculares;
    private String emocional;
    private String violencia;
    private String riesgosPsicosociales;
    private String otrosRiesgos;
    private String enfermedad;
    private String deserto;
    
    
    
    
	public EstudianteBean() {
		super();
	}
	public EstudianteBean(Integer id, int edad, String sexo, String estadoCarrera, String estadoCivil, String horarioDeseado, int semestre, String puntajeIcfes, String recurso, int estrato,
			int edadPresentacionIcfes, String ocupacion, String descripcionFamiliar, String ciudadDeProcedencia,
			String nivelEducativo, int interesVocacional, int proyeccionProfesional, int conocimientoDeSiMismo,
			int capacidadComunicativa, int comportamientoEntrevista, String perdidaDeCursoColegio, String homologacion,
			String matricula, int apoyoFamiliarEconomico, String numeroHermanos, String posicionDentroHermanos,
			String recomiendaAdmision, String seguimientoPae, String cargaAcademica, String riesgoAcademico,
			String temaDeAtencion, String canalLlegada, String riesgosInstitucionales, int actividadesExtracurriculares,
			String emocional, String violencia, String riesgosPsicosociales, String otrosRiesgos, String enfermedad,
			String deserto) {
		super();
		this.id = id;
		this.edad = edad;
		this.sexo = sexo;
		
		this.estadoCarrera = estadoCarrera;
		this.estadoCivil = estadoCivil;

		this.horarioDeseado = horarioDeseado;
		this.semestre = semestre;
		this.puntajeIcfes = puntajeIcfes;
		this.recurso = recurso;
		this.estrato = estrato;
		this.edadPresentacionIcfes = edadPresentacionIcfes;
		this.ocupacion = ocupacion;
		this.descripcionFamiliar = descripcionFamiliar;
		this.ciudadDeProcedencia = ciudadDeProcedencia;
		this.nivelEducativo = nivelEducativo;
		this.interesVocacional = interesVocacional;
		this.proyeccionProfesional = proyeccionProfesional;
		this.conocimientoDeSiMismo = conocimientoDeSiMismo;
		this.capacidadComunicativa = capacidadComunicativa;
		this.comportamientoEntrevista = comportamientoEntrevista;
		this.perdidaDeCursoColegio = perdidaDeCursoColegio;
		this.homologacion = homologacion;
		this.matricula = matricula;
		this.apoyoFamiliarEconomico = apoyoFamiliarEconomico;
		this.numeroHermanos = numeroHermanos;
		this.posicionDentroHermanos = posicionDentroHermanos;
		this.recomiendaAdmision = recomiendaAdmision;
		this.seguimientoPae = seguimientoPae;
		this.cargaAcademica = cargaAcademica;
		this.riesgoAcademico = riesgoAcademico;
		this.temaDeAtencion = temaDeAtencion;
		this.canalLlegada = canalLlegada;
		this.riesgosInstitucionales = riesgosInstitucionales;
		this.actividadesExtracurriculares = actividadesExtracurriculares;
		this.emocional = emocional;
		this.violencia = violencia;
		this.riesgosPsicosociales = riesgosPsicosociales;
		this.otrosRiesgos = otrosRiesgos;
		this.enfermedad = enfermedad;
		this.deserto = deserto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEstadoCarrera() {
		return estadoCarrera;
	}
	public void setEstadoCarrera(String estadoCarrera) {
		this.estadoCarrera = estadoCarrera;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getHorarioDeseado() {
		return horarioDeseado;
	}
	public void setHorarioDeseado(String horarioDeseado) {
		this.horarioDeseado = horarioDeseado;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getPuntajeIcfes() {
		return puntajeIcfes;
	}
	public void setPuntajeIcfes(String puntajeIcfes) {
		this.puntajeIcfes = puntajeIcfes;
	}
	public String getRecurso() {
		return recurso;
	}
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	public int getEstrato() {
		return estrato;
	}
	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}
	public int getEdadPresentacionIcfes() {
		return edadPresentacionIcfes;
	}
	public void setEdadPresentacionIcfes(int edadPresentacionIcfes) {
		this.edadPresentacionIcfes = edadPresentacionIcfes;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getDescripcionFamiliar() {
		return descripcionFamiliar;
	}
	public void setDescripcionFamiliar(String descripcionFamiliar) {
		this.descripcionFamiliar = descripcionFamiliar;
	}
	public String getCiudadDeProcedencia() {
		return ciudadDeProcedencia;
	}
	public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
		this.ciudadDeProcedencia = ciudadDeProcedencia;
	}
	public String getNivelEducativo() {
		return nivelEducativo;
	}
	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}
	public int getInteresVocacional() {
		return interesVocacional;
	}
	public void setInteresVocacional(int interesVocacional) {
		this.interesVocacional = interesVocacional;
	}
	public int getProyeccionProfesional() {
		return proyeccionProfesional;
	}
	public void setProyeccionProfesional(int proyeccionProfesional) {
		this.proyeccionProfesional = proyeccionProfesional;
	}
	public int getConocimientoDeSiMismo() {
		return conocimientoDeSiMismo;
	}
	public void setConocimientoDeSiMismo(int conocimientoDeSiMismo) {
		this.conocimientoDeSiMismo = conocimientoDeSiMismo;
	}
	public int getCapacidadComunicativa() {
		return capacidadComunicativa;
	}
	public void setCapacidadComunicativa(int capacidadComunicativa) {
		this.capacidadComunicativa = capacidadComunicativa;
	}
	public int getComportamientoEntrevista() {
		return comportamientoEntrevista;
	}
	public void setComportamientoEntrevista(int comportamientoEntrevista) {
		this.comportamientoEntrevista = comportamientoEntrevista;
	}
	public String getPerdidaDeCursoColegio() {
		return perdidaDeCursoColegio;
	}
	public void setPerdidaDeCursoColegio(String perdidaDeCursoColegio) {
		this.perdidaDeCursoColegio = perdidaDeCursoColegio;
	}
	public String getHomologacion() {
		return homologacion;
	}
	public void setHomologacion(String homologacion) {
		this.homologacion = homologacion;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getApoyoFamiliarEconomico() {
		return apoyoFamiliarEconomico;
	}
	public void setApoyoFamiliarEconomico(int apoyoFamiliarEconomico) {
		this.apoyoFamiliarEconomico = apoyoFamiliarEconomico;
	}
	public String getNumeroHermanos() {
		return numeroHermanos;
	}
	public void setNumeroHermanos(String numeroHermanos) {
		this.numeroHermanos = numeroHermanos;
	}
	public String getPosicionDentroHermanos() {
		return posicionDentroHermanos;
	}
	public void setPosicionDentroHermanos(String posicionDentroHermanos) {
		this.posicionDentroHermanos = posicionDentroHermanos;
	}
	public String getRecomiendaAdmision() {
		return recomiendaAdmision;
	}
	public void setRecomiendaAdmision(String recomiendaAdmision) {
		this.recomiendaAdmision = recomiendaAdmision;
	}
	public String getSeguimientoPae() {
		return seguimientoPae;
	}
	public void setSeguimientoPae(String seguimientoPae) {
		this.seguimientoPae = seguimientoPae;
	}
	public String getCargaAcademica() {
		return cargaAcademica;
	}
	public void setCargaAcademica(String cargaAcademica) {
		this.cargaAcademica = cargaAcademica;
	}
	public String getRiesgoAcademico() {
		return riesgoAcademico;
	}
	public void setRiesgoAcademico(String riesgoAcademico) {
		this.riesgoAcademico = riesgoAcademico;
	}
	public String getTemaDeAtencion() {
		return temaDeAtencion;
	}
	public void setTemaDeAtencion(String temaDeAtencion) {
		this.temaDeAtencion = temaDeAtencion;
	}
	public String getCanalLlegada() {
		return canalLlegada;
	}
	public void setCanalLlegada(String canalLlegada) {
		this.canalLlegada = canalLlegada;
	}
	public String getRiesgosInstitucionales() {
		return riesgosInstitucionales;
	}
	public void setRiesgosInstitucionales(String riesgosInstitucionales) {
		this.riesgosInstitucionales = riesgosInstitucionales;
	}
	public int getActividadesExtracurriculares() {
		return actividadesExtracurriculares;
	}
	public void setActividadesExtracurriculares(int actividadesExtracurriculares) {
		this.actividadesExtracurriculares = actividadesExtracurriculares;
	}
	public String getEmocional() {
		return emocional;
	}
	public void setEmocional(String emocional) {
		this.emocional = emocional;
	}
	public String getViolencia() {
		return violencia;
	}
	public void setViolencia(String violencia) {
		this.violencia = violencia;
	}
	public String getRiesgosPsicosociales() {
		return riesgosPsicosociales;
	}
	public void setRiesgosPsicosociales(String riesgosPsicosociales) {
		this.riesgosPsicosociales = riesgosPsicosociales;
	}
	public String getOtrosRiesgos() {
		return otrosRiesgos;
	}
	public void setOtrosRiesgos(String otrosRiesgos) {
		this.otrosRiesgos = otrosRiesgos;
	}
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	public String getDeserto() {
		return deserto;
	}
	public void setDeserto(String deserto) {
		this.deserto = deserto;
	}
    
    
    

}
