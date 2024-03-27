package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HabitusExteriorView {
    Long idHabitusExterior;
    Long idExploracionFisica;
    Long idHistoriaClinica;
    String habitus;
    String comentarios;
}
