package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatCuestionarioView implements Serializable {
    Integer idCuestionario;
    String nombre;
    String creadoPor;
    Date createdDate;
    Boolean active;
    Integer sort;
}
