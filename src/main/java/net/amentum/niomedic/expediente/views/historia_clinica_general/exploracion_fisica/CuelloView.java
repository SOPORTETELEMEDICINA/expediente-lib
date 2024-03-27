package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CuelloView {
    Long idCuello;
    Long idHistoriaClinica;
    Boolean masas;
    Boolean movil;
    Boolean pulso;
    String tiroides;
    String linfaticos;
    String vasos;
    Boolean acantosis;
    String comentarios;
}
