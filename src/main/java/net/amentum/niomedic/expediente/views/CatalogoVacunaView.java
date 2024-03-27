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
public class CatalogoVacunaView implements Serializable {
    private Long idCatalogoVacuna;
    private String nombreVacuna;
    private String enfermedades;
    private Boolean activo;
    //relaciones
    private CatalogoDosisVacunaView catalogoDosisVacunaView;
}
