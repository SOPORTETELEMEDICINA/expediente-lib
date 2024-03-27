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
public class CatalogoInstitucionMedicaView implements Serializable {
    private Long idCatalogoInstitucionMedica;
    private String clave;
    private String claveCorta;
    private String nombre;
    private Boolean activo;
}
