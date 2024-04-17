package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ToraxView {
    Long idTorax;
    Long idHistoriaClinica;
    String torax;
    String respiracion;
    String ganglios;
    Boolean ruidosCardiacos;
    String ruidosCardiacosOtros;
    String mamasSimetria;
    Boolean mamasGinecomastia;
    String mamasMasas;
    String mamasSecreciones;
    String mamasOtros;
    String murmulloVesicular;
    String murmulloVesicularLocalizacion;
    String ruidosSoplos;
    String ruidosSoplosLocalizacion;
    String ruidosEstertores;
    String ruidosEstertoresLocalizacion;
    String posteriorPulmonaresAlteraciones;
    Boolean musculosParavertebralesAtroficos;
    Boolean musculosParavertebralesDolor;
    Boolean escoliosis;
    Boolean cifosis;
    Boolean lordosis;
    String ruidosRespiratorios;
    String cardiacos;
    String comentarios;
}
