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
public class CatalogoDrogasView implements Serializable {
    private Long idCatalogoDrogas;
    private String nombreDroga;
    private String unidadMedida;
    private Boolean activo;
}
