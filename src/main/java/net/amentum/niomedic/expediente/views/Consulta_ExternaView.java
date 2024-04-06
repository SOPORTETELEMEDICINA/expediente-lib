package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Consulta_ExternaView {

    Long id;
    @NotNull
    @Size(max = 11)
    String clues;
    @NotNull
    Integer paisNacimiento;
    @NotNull
    @Size(max = 18)
    String curpPrestador;
    @NotNull
    @Size(max = 50)
    String nombrePrestador;
    @NotNull
    @Size(max = 50)
    String primerApellidoPrestador;
    @Size(max = 50)
    String segundoApellidoPrestador;
    @NotNull
    Integer tipoPersonal;
    @NotNull
    @Size(max = 18)
    String curpPaciente;
    @NotNull
    @Size(max = 50)
    String nombre;
    @NotNull
    @Size(max = 50)
    String primerApellido;
    @NotNull
    @Size(max = 50)
    String segundoApellido;
    @NotNull
    @Size(max = 10)
    String fechaNacimiento;
    @NotNull
    @Size(max = 2)
    String entidadNacimiento;
    @NotNull
    Integer sexo;
    @NotNull
    Integer seConsideraIndigena;
    @NotNull
    Integer seAutodenominaAfromexicano;
    @NotNull
    Integer genero;
    @NotNull
    @Size(max = 20)
    String derechohabiencia;
    @NotNull
    Integer programaSMyMG;
    @NotNull
    @Size(max = 10)
    String fechaConsulta;
    @NotNull
    Integer servicioAtencion;
    @NotNull
    Double peso;
    @NotNull
    Integer talla;
    @NotNull
    Integer circunferenciaCintura;
    @NotNull
    Integer sistolica;
    @NotNull
    Integer diastolica;
    @NotNull
    Integer frecuenciaCardiaca;
    @NotNull
    Integer frecuenciaRespiratoria;
    @NotNull
    Double temperatura;
    @NotNull
    Integer saturacionOxigeno;
    @NotNull
    Integer glucemia;
    @NotNull
    Integer tipoMedicion;
    @NotNull
    Integer numeroTirasControlUtilizadas;
    @NotNull
    Integer embarazadaSinDiabetes;
    @NotNull
    Integer primeraVezAnio;
    @NotNull
    Integer primeraVezUnemeSaih;
    @NotNull
    Integer tipoDificultad;
    @NotNull
    Integer gradoDificultad;
    @NotNull
    Integer origenDificultad;
    @NotNull
    Integer migrante;
    @NotNull
    Integer relacionTemporal;
    @NotNull
    @Size(max = 255)
    String descripcionDiagnostico1;
    @NotNull
    @Size(max = 4)
    String codigoCIEDiagnostico1;
    @NotNull
    @Size(max = 255)
    String descripcionDiagnostico2;
    @NotNull
    Integer primeraVezDiagnostico2;
    @Size(max = 4)
    String codigoCIEDiagnostico2;
    @Size(max = 255)
    String descripcionDiagnostico3;
    @NotNull
    Integer primeraVezDiagnostico3;
    @Size(max = 4)
    String codigoCIEDiagnostico3;
    @NotNull
    Integer sintomaticoRespiratorioTb;
    @NotNull
    Integer atencionPregestacionalRT;
    @Size(max = 10)
    String riesgo;
    @NotNull
    Integer relacionTemporalEmbarazo;
    @NotNull
    Integer trimestreGestacional;
    @NotNull
    Integer primeraVezAltoRiesgo;
    @NotNull
    Integer complicacionPorDiabetes;
    @NotNull
    Integer complicacionPorInfeccionUrinaria;
    @NotNull
    Integer complicacionPorPreeclampsiaEclampsia;
    @NotNull
    Integer complicacionPorHemorragia;
    @NotNull
    Integer sospechaCovid19;
    @NotNull
    Integer covid19Confirmado;
    @NotNull
    Integer otrasAccPrescAcidoFolico;
    @NotNull
    Integer otrasAccApoyoTranslado;
    @NotNull
    Integer puerpera;
    @NotNull
    Integer infeccionPuerperal;
    @NotNull
    Integer terapiaHormonal;
    @NotNull
    Integer periPostMenopausia;
    @NotNull
    Integer its;
    @NotNull
    Integer patologiaMamariaBenigna;
    @NotNull
    Integer cancerMamario;
    @NotNull
    Integer colposcopia;
    @NotNull
    Integer cancerCervicouterino;
    @NotNull
    Integer ninoSanoRT;
    @NotNull
    Integer pesoParaTalla;
    @NotNull
    Integer pruebaEDI;
    @NotNull
    Integer resultadoEDI;
    @NotNull
    Integer resultadoBattelle;
    @NotNull
    Integer aplicacionCedulaCancer;
    @NotNull
    Integer confirmacionCancer;
    @NotNull
    Integer edasRT;
    @NotNull
    Integer edasPlanTratamiento;
    @NotNull
    Integer recuperadoDeshidratacion;
    @NotNull
    Integer numeroSobresVSOTratamiento;
    @NotNull
    Integer numeroSobresVSOPromocion;
    @NotNull
    Integer irasRT;
    @NotNull
    Integer irasPlanTratamiento;
    @NotNull
    Integer neumoniaRT;
    @NotNull
    Integer informaPrevencionAccidentes;
    @NotNull
    Integer sintomaDepresiva;
    @NotNull
    Integer alteracionMemoria;
    @NotNull
    Integer aivdABVD;
    @NotNull
    Integer sindromeCaidas;
    @NotNull
    Integer incontinenciaUrinaria;
    @NotNull
    Integer motricidad;
    @NotNull
    Integer asesoriaNutricional;
    @NotNull
    Integer lineaVida;
    @NotNull
    Integer cartillaSalud;
    @NotNull
    Integer referidoPor;
    @NotNull
    Integer contrarreferido;
    @NotNull
    Integer telemedicina;
}
