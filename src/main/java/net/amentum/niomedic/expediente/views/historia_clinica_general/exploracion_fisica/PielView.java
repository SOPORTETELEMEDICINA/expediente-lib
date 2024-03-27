package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PielView {
    Long idPiel;
    Long idHistoriaClinica;
    Boolean planasMacula;
    Boolean planasTelangiectasias;
    Boolean planasEsclerosis;
    Boolean elevadasPapula;
    Boolean elevadasPlaca;
    Boolean elevadasNodulo;
    Boolean elevadasVesicula;
    Boolean elevadasAmpolla;
    Boolean elevadasAbsceso;
    Boolean elevadasEscara;
    Boolean elevadasCicatriz;
    Boolean deprimidasAtrofia;
    Boolean deprimidasExcoriacion;
    Boolean deprimidasErosion;
    Boolean deprimidasUlcera;
    String comentarios;
    Boolean manchas;
    Boolean masas;
    Boolean lesiones;
}
