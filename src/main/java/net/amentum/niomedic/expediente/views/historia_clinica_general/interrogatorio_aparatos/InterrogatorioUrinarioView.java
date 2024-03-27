package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioUrinarioView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean disuria;
    Boolean hematuria;
    Boolean poliuria;
    Boolean nicturia;
    Boolean incontinencia;
    String comentarios;
}
