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
public class CatCie9View implements Serializable{
   private static final long serialVersionUID = -7802754719213681940L;
   private Long idCie9;
   @NotEmpty(message="No puede ser nulo/vacio")
   private String catalogKey;
   @Size(max = 255, message="No puede contener más de 255 caracteres")
   @NotEmpty(message="No puede ser nulo/vacio")
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
   @NotNull(message="No puede ser nulo")
   private Boolean activo;

}
