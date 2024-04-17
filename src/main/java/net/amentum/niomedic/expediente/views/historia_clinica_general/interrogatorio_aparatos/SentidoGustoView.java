package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SentidoGustoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean normal;
    Boolean ardosa;
    Boolean alterado;
    Boolean aftas;
    Boolean disgeusia;
    Boolean ageusia;
    Boolean hipoageusia;
    Boolean halitosis;
    Boolean gingivitis;
    Boolean gingivorrea;
    Boolean gingivorragia;
    Boolean glositis;
    String tiempoEvol;
    String comentarios;
}
