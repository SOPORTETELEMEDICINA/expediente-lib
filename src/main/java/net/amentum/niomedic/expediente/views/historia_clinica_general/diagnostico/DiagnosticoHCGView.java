package net.amentum.niomedic.expediente.views.historia_clinica_general.diagnostico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.amentum.niomedic.expediente.views.CatCie10View;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiagnosticoHCGView {
    Long idDiagnosticoHC;
    Long idHistoriaClinica;
    String comentarios;
    String notas;
    List<CatCie10View> lstCie10 = new ArrayList<>();
}
