package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioHematologicoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean anemia;
    String anemiaTiempoEvol;
    String anemiaCaracteristicas;
    Boolean sangrados;
    String sangradosLocalizacion;
    String sangradosTiempoEvol;
    String sangradosCaracteristicas;
    Boolean coagulos;
    String coagulosTiempoEvol;
    String coagulosCaracteristicas;
    Boolean hematomas;
    String hematomasLocalizacion;
    String hematomasTiempoEvol;
    String hematomasCaracteristicas;
    String comentarios;
}
