package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SistemaNerviosoView {
    Long idSistemaNervioso;
    Long idHistoriaClinica;
    Object orientadoEn;
    Object fuerzaMuscular;
    Object reflejoOsteo;
    Boolean orientadoenTiempo;
    Boolean orientadoenEspacio;
    Boolean orientadoenPersona;
    String fuerzaMuscularBrazoIzq;
    String fuerzaMuscularBrazoDer;
    String fuerzaMuscularPiernaIzq;
    String fuerzaMuscularPiernaDer;
    String tonoMuscular;
    String reflejoOsteoBrazoizqEstado;
    String reflejoOsteoBrazoizqComentario;
    String reflejoOsteoBrazoderEstado;
    String reflejoOsteoBrazoderComentario;
    String reflejoOsteoPiernaizqEstado;
    String reflejoOsteoPiernaizqComentario;
    String reflejoOsteoPiernaderEstado;
    String reflejoOsteoPiernaderComentario;
    String marcha;
}
