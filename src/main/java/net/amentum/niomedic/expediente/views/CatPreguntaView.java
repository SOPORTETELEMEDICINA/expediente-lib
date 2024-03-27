package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatPreguntaView implements Serializable {
    Integer idPregunta;
    Integer idCuestionario;
    String pregunta;
    Boolean active;
    Date createdDate;
    Integer sort;
    Integer tipoPregunta;
    String nombreCuestionario;
}
