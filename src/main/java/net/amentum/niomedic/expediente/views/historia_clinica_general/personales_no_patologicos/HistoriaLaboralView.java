package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HistoriaLaboralView {
    Long idHistoriaLaboral;
    Long idHistoriaClinica;
    Boolean trabajaSi;
    Boolean trabajaNo;
    Boolean jubilado;
    Boolean jubilacionEdad;
    Boolean jubilacionEnfermedad;
    String jubilacionInput;
    String comentariosConsumo;
}
