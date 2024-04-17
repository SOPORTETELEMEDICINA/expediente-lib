package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SentidoOlfatoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean normal;
    Boolean alterado;
    String tiempoEvol;
    Boolean anosmia;
    Boolean cacosomia;
    Boolean hiposmia;
    Boolean parosmia;
    Boolean congestion;
    Boolean rinorrea;
    Boolean epitaxis;
    Boolean pruritoNasal;
    String comentarios;
}
