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
public class SentidoAudicionView {
    Long idInterrogatorio;
    @NotNull(message = "id de historia clinica general vacio")
    Long idHistoriaClinica;
    Boolean audicionNormal = false;
    String audicionNormalOido;
    Boolean audicionHipo = false;
    String audicionHipoOido;
    Boolean audicionHiper = false;
    String audicionHiperOido;
    Boolean audicionAnacusia = false;
    String audicionAnacusiaOido;
    Boolean audicionOtalgia = false;
    String audicionOtalgiaOido;
    Boolean audicionTinitus = false;
    String audicionTinitusOido;
    Boolean secrecionOtorrea = false;
    String secrecionOtorreaOido;
    Boolean secrecionOtorraquia = false;
    String secrecionOtorraquiaOido;
    Boolean secrecionOtorragia = false;
    String secrecionOtorragiaOido;
    String secrecionInput;
    String comentarios;
}
