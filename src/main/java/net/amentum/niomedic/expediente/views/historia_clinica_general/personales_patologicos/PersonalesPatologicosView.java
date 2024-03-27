package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonalesPatologicosView {
    Long id;
    Long idHistoriaClinica;
    Boolean alergias;
    String textAlergias;
    Boolean cirugias;
    String textCirugias;
    Boolean transfusiones;
    String textTransfuciones;
    Boolean hospitalizacion;
    String textHospitalizacion;
    String comentarios;
    String notas;
    Collection<PadecimientoPersonalPatologicoView> datosTabla = new ArrayList<>();
}
