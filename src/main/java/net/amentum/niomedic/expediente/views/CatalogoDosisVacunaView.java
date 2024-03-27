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
public class CatalogoDosisVacunaView implements Serializable {
    private Long idCatalogoDosisVacuna;
    private String dosis;
    private Boolean activo;
}
