package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioGenitourinarioView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean genitoAsintomatico;
    Boolean pujo;
    Boolean pujoMiccional;
    Boolean pujoTerminal;
    Boolean disuria;
    Boolean poliaquiria;
    Boolean incontinencia;
    String incontinenciaTipo;
    String incontinenciaTiempoEvol;
    String incontinenciaTratamiento;
    Boolean colicoRenoureteral;
    String colicoRenoureteralEvn;
    Boolean dolorRenal;
    String dolorRenalCaracteristicas;
    String dolorRenalTiempoEvol;
    String dolorRenalTratamiento;
    String dolorRenalEva;
    Boolean chorroInterrumpido;
    Boolean vaciamientoIncompleto;
    Boolean retencionUrinaria;
    String ritmoMiccional;
    String calibreDescripcion;
    Boolean prostatitis;
    String prostatitisCaracteristicas;
    String prostatitisTiempoEvol;
    String prostatitisTratamiento;
    Boolean incontinenciaHombre;
    String incontinenciaHombreTipo;
    String incontinenciaHombreTiempo;
    String incontinenciaHombreTratamiento;
    Boolean impotenciaHombre;
    String impotenciaHombreTipo;
    String impotenciaHombreTiempo;
    String impotenciaHombreTratamiento;
    Boolean criptorquidia;
    String criptorquidiaCausa;
    String criptorquidiaTiempoEvol;
    Boolean priapismoSi;
    String  priapismo;
    Boolean tactoRectal;
    Date tactoRectalFecha;
    Boolean tactoRectalNormal;
    Boolean tactoRectalAnormal;
    String tactoRectalDescripcion;
    Boolean precoz;
    String precozTiempoEvol;
    String precozOtros;
    Boolean antigeno;
    Date antigenoFecha;
    Boolean antigenoResultadoNormal;
    Boolean antigenoResultadoAnormal;
    String antigenoDescripcion;
    Boolean polaquiuria;
    Boolean nicturia;
    Boolean urgenciaUrinaria;
    Boolean tenesmoVesical;
    Boolean incontinenciaUrgencia;
    Boolean chorroDebil;
    Boolean vacilacion;
    Boolean chorroIntermitente;
    Boolean goteoPostmiccional;
    Boolean retencionOrina;
    Boolean incontinenciaRebosamiento;
    String coloracion;
    Boolean hematuria;
    String olor;
    Boolean sedimento;
    String hombresEreccionDisfuncion;
    String hombresEreccionEvolucion;
    String hombresEreccionCalidad;
    String hombresEreccionMasturbacion;
    Boolean hombresEyaculacionDolor;
    Boolean hombresEyaculacionSangrado;
    Boolean hombresEyaculacionAneyaculacion;
    Boolean hombresEyaculacionRetardada;
    Boolean hombresEyaculacionPrecoz;
    String hombresEyaculacionOtro;
    String hombresLibido;
    Boolean hombresLesionesVerrugas;
    Boolean hombresLesionesUlceras;
    Boolean hombresLesionesVesiculas;
    Boolean hombresLesionesLunares;
    Boolean hombresLesionesCurvaturas;
    String comentarios;
}