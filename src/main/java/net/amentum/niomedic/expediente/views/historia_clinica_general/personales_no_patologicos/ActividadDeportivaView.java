package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ActividadDeportivaView {
    Long idActivadDeportiva;
    Long idHistoriaClinica;
    Boolean acDeportivaNo;
    Boolean acDeportivaSi;
    String acDeportivaFrecuencia;
    String tipoActividadInput;
}
