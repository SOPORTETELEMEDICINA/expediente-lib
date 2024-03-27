package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CuestionarioRespuestaView implements Serializable {
    Integer idRespuesta;
    Integer idCuestionario;
    String creadoPor;
    ArrayList<Map<String, Object>> json;
    Date createdDate;
    String idPaciente;
    Boolean active = Boolean.TRUE;
}
