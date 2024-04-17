package net.amentum.niomedic.expediente.views.historia_clinica_general.estudio_laboratorio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HCEstudioLabEstudioView {
    Long id;
    Long idHistoriaClinica;
    Long idEstudioLaboratorio;
    String tipo;
    String descripcion;
    String comentarios;
}
