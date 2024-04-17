package net.amentum.niomedic.expediente.views.historia_clinica_general.tratamiento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.amentum.niomedic.expediente.views.CatCie9View;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HCTratamientoView {
    Long idTratamiento;
    Long idHistoriaClinica;
    String comentarios;
    String notas;
    List<CatCie9View> lstCie9 = new ArrayList<>();
}
