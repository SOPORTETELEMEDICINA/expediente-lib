package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CatalogoEspecialidadView implements Serializable {
    private Long idCatalogoEspecialidad;
    private Integer claveEspecialidad;
    private String descripcionEspecialidad;
    private Boolean activo;
}
