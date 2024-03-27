package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioSistemaNerviosoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean nervioAsintomatico;
    String suenioCantidad;
    Boolean suenioReparador;
    Boolean somnolencia;
    Boolean epilepsia;
    String insomnioTiempoEvol;
    String insomnioCaracteristicas;
    String insomnioTratamiento;
    String dolorTipoSelect;
    String convulsionesFrecuencia;
    Integer convulsionesNumero;
    String convulsionesOtro;
    String migraniaLocalizacion;
    String migraniaCaracteristicas;
    String migraniaTiempoEvol;
    String migraniaTratamiento;
    String perdidaEquilibrioCaracteristicas;
    String perdidaEquilibrioTiempoEvol;
    String perdidaEquilibrioTratamiento;
    String hiposensibilidadLocalizacion;
    String hiposensibilidadTiempoEvol;
    String alodiniaLocalizacion;
    String alodiniaTiempoEvol;
    String parestesiasLocalizacion;
    String parestesiasTiempoEvol;
    Boolean parkinson;
    String parkinsonCaracteristicas;
    String parkinsonTiempoEvol;
    String parkinsonTratamiento;
    String perdidaConcienciaCaracteristicas;
    String perdidaConcienciaTiempoEvol;
    String perdidaConcienciaCausa;
    String perdidaConcienciaTratamiento;
    Boolean hipersensibilidad;
    String hipersensibilidadLocalizacion;
    String hipersensibilidadTiempoEvol;
    String hiperalgesiaLocalizacion;
    String hiperalgesiaTiempoEvol;
    String perdidaMemoriaCaracteristicas;
    String perdidaMemoriaTiempoEvol;
    String perdidaMemoriaCausa;
    String perdidaMemoriaTratamiento;
    String comentarios;
    Boolean estuporoso;
    Boolean mareos;
    Boolean vertigo;
    Boolean hipersomnia;
    Boolean hiposomnia;
    Boolean cefalea;
    Boolean movimientosInvoluntarios;
    Boolean tics;
    Boolean nistagmo;
    Boolean marchaInestable;
    Boolean temblor;
    Boolean calambresMusculares;
    Boolean debilidadMuscular;
    Boolean hiperestesia;
    Boolean hipoestesia;
    Boolean disestesia;
    Boolean hiperpatia;
}
