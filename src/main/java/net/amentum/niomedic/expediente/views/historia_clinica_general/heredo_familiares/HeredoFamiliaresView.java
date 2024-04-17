package net.amentum.niomedic.expediente.views.historia_clinica_general.heredo_familiares;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HeredoFamiliaresView {
    Long idHeredoFamiliares;
    Long idHistoriaClinica;
    String comentarios;
    String notas;
    List<HfEnfermedadesView> datosTabla;
}
