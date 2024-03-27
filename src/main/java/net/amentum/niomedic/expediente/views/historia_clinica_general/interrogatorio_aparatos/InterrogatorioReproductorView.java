package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioReproductorView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean desechos;
    Boolean dolorGenital;
    Boolean poliuria;
    String comentarios;
}
