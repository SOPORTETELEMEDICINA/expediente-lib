package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanificacionFamiliarView implements Serializable {
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
    Integer primeraVezAnio;
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
    Integer puerperaAceptaPF;
    @NotNull
    Integer oral;
    @NotNull
    Integer inyectableMensual;
    @NotNull
    Integer inyectableBimestral;
    @NotNull
    Integer implanteSubdermico;
    @NotNull
    Integer parcheDermico;
    @NotNull
    Integer diu;
    @NotNull
    Integer diuMedicado;
    @NotNull
    Integer quirurgico;
    @NotNull
    Integer preservativo;
    @NotNull
    Integer preservativoFemenino;
    @NotNull
    Integer otroMetodo;
    @NotNull
    Integer orientacionPF;
    @NotNull
    Integer anticoncepcionEmergencia;
    @NotNull
    Integer altaConAzoospermia;
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
