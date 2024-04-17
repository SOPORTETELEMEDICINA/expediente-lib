package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SentidoTactoView {
    Long idInterrogatorio;
    @NotNull(message = "id de historia clinica general vacio")
    Long idHistoriaClinica;
    Boolean normal;
    Boolean hiposensible;
    String hiposensibleLocalizacion;
    Boolean hipersensible;
    String hipersensibleLocalizacion;
    String localizacion;
    String tactoTiempoEvol;
    Boolean esterognosia;
    String esterogInput;
    String comentarios;
}


