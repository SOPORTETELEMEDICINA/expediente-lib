package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioOncologicoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean neoplasias;
    String neoplasiasLocalizacion;
    String neoplasiasTipo;
    String neoplasiasTiempoEvol;
    String neoplasiasTratamiento;
    String neoplasiasComplicaciones;
    String pronostico;
    String dolorLocalizacion;
    Boolean dolorOncologico;
    Boolean dolorPorEnfermedad;
    Boolean dolorPorCompresion;
    String dolorOtro;
    String dolorEVN;
    String estadio;
    String conociminetoPatologia;
    String enfermedadesInmunoCuales;
    String enfermedadesInmunoTiempoEvol;
    String enfermedadesInmunoTratamiento;
    String comentarios;
}
