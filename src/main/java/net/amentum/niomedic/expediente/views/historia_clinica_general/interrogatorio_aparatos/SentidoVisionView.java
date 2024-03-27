package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SentidoVisionView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean visionNormal;
    String visionNormalOjo;
    Boolean visionBorrosa;
    String visionBorrosaOjo;
    String visionOjo;
    Boolean ceguera;
    String cegueraOjo;
    Boolean cegueraderecho;
    Boolean cegueraizquierdo;
    Boolean cegueraBilateral;
    Boolean dolor;
    String dolorOjo;
    Boolean dolorDerecho;
    Boolean dolorIzquierdo;
    Boolean fotofobia;
    Boolean diplopia;
    String diplopiaOjo;
    Boolean diplopiaderecho;
    Boolean diplopiaizquierdo;
    Boolean prurito;
    String pruritoOjo;
    Boolean pruritoderecho;
    Boolean pruritoizquierdo;
    Boolean pruritoBilateral;
    Boolean hipermetropia;
    Boolean miopia;
    Boolean astigmatismo;
    Boolean presbicia;
    Boolean lentes;
    String lentesCausa;
    Boolean enrojecimiento;
    String enrojecimientoOjo;
    Boolean enrojecimientoDerecho;
    Boolean enrojecimientoIzquierdo;
    Boolean catarata;
    String catarataOjo;
    Boolean catarataBorrosa;
    Boolean catarataDerecho;
    Boolean catarataIzquierdo;
    Boolean catarataBilateral;
    Boolean resequedad;
    String resequedadOjo;
    Boolean resequedadDerecho;
    Boolean resequedadIzquierdo;
    Boolean resequedadBilateral;
    Boolean secrecion;
    String secrecionOjo;
    Boolean secrecionDerecho;
    Boolean secrecionzquiedo;
    Boolean secrecionBilateral;
    String comentarios;
}
