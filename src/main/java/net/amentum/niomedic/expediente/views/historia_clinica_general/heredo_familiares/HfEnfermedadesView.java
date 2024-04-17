package net.amentum.niomedic.expediente.views.historia_clinica_general.heredo_familiares;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HfEnfermedadesView {
    Long idHfEnfermedades;
    Long idHeredoFamiliares;
    Long idHistoriaClinica;
    Boolean tieneEnfermedad;
    String enfermedad;
    Boolean Padre;
    String infoPadre;
    Boolean Madre;
    String infoMadre;
    Boolean Hermanos;
    String infoHermanos;
    Boolean abuPaternos;
    String infoAbuPaternos;
    Boolean abuMaternos;
    String infoAbuMaternos;
    Boolean tiosPaternos;
    String infoTiosPaternos;
    Boolean tiosMaternos;
    String infoTiosMaternos;
}
