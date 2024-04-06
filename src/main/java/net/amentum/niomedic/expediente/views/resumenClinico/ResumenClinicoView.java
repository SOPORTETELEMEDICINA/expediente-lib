package net.amentum.niomedic.expediente.views.resumenClinico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResumenClinicoView {
    String idPruebas;
    String nombreEstablecimientoSalud;
    String domicilioCompleto;
    String telefono;
    String nacionalidad;
    String cedulaMedico;
    String nombreInstitucion;
    String valorLocalidad;
    String valorMunicipio;
    String valorEntidad;
    String valorCodigoPostal;
    String pais;
    String telefonoPrestador;
    String nombreContacto;
    String tipoVialidadContacto;
    String nombreVialidadContacto;
    String numeroExteriorContacto;
    String numeroInteriorContacto;
    String tipoAsentamientoContacto;
    String nombreAsentamientoContacto;
    String valorLocalidadContacto;
    String valorMunicipioContacto;
    String valorEntidadContacto;
    String valorCodigoPostalContacto;
    String paisContacto;
    String telefonoContacto;
    String correoContacto;
    String fechaInicioAlcohol;
    String fechaFinAlcohol;
    String consumoAlcohol;
    String fechaInicioTabaquismo;
    String fechaFinTabaquismo;
    String cigarrosDia;
    String fechaInicioSustancias;
    String fechaFinSustancias;
    String consumoSustancias;
    String nombreSustancia;
    String otrosAntecedentes;
    String hipertension;
    String dislipidemias;
    String diabetes;
    String tiempoConDiabetes;
    String tiempoConHipertension;
    String tiempoConHipertiroidismo;
    String tipoSangre;
    String nombreAlergeno;
    String fechaInicialAlergias;
    String nombreMedicoAlergiaDeteccion;
    String reaccion;
    String estadoActual;
    String observaciones;
    String descripcionDiscapacidad;
    String tipoDiagnostico;
    String fechaDiagnostico;
    String claveCIE;
    String descripcionDiagnostico;
    String observacionDiagnostico;
    String CIE9MC;
    String procedmientoCIE9MC;
    String estadoCIE9MC;
    String activoCIE9MC;
    String observacionesCIE9MC;
    String inicioVigencia;
    String finVigencia;
    String nombrePorgrama;
    String poliza;
    String folio;
    String tipoBeneficiario;
    String nombreMedicamentoTer;
    String viaAdministracionTer;
    String dosisTer;
    String fechaInicioMedicamentTer;
    String fechaFinMedicamentoTer;
    String observacionPrescripcionTer;
    String observacionSigno;
    String fechaSigno;
    String signoVital;
    String resultadoSigno;
    String nombrePrueba;
    ArrayList<Object> resultado;
    String fechaResultado;
    String resultadoLab;
    String rangoResultado;
    String fechaCreacion;
    String noDocumento;
    String nombrePaciente;
    String primerApellido;
    String segundoApellido;
    String idPaciente;
    String curpPaciente;
    String genero;
    String etnia;
    String fechaNacimientoPaciente;
    String estadoCivilPaciente;
    String religion;
    String nombreMedico;
    String fechaInicioAtencion;
    String fechaFinAtencion;
    String motivoReferencia;
    String nombreMedicamento;
    String viaAdministracion;
    String dosis;
    String fechaInicioMedicamento;
    String fechaFinMedicamento;
    String observacionPrescripcion;
    String descripcionSintomatologia;
    String descripcionEstadoPaciente;
    String descripcionEvolucion;
    String indicaciones;
    String pronostico;
}