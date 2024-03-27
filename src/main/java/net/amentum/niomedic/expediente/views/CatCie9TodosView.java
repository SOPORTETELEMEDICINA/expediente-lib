package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CatCie9TodosView implements Serializable {
    private Long idCie9;
    private String catalogKey;
    private String proNombre;
    private String proCveEdia;
    private String proEdadIa;
    private String proCveEdfa;
    private String proEdadFa;
    private String sexType;
    private String porNivela;
    private String procedimientoType;
    private String proPrincipal;
    private String proCapitulo;
    private String proSeccion;
    private String proCategoria;
    private String proSubcateg;
    private String proGrupoLc;
    private String proEsCauses;
    private String proNumCauses;
    private String datosBusqueda;
    private Boolean activo;

}
