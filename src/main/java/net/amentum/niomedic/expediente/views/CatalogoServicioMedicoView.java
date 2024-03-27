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
public class CatalogoServicioMedicoView implements Serializable {
    private Long idCatalogoServicioMedico;
    private String nombre;
    private Boolean activo;
}