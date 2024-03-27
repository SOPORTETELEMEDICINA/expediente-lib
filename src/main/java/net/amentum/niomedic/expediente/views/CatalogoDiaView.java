package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CatalogoDiaView implements Serializable {
   private Integer idCatalogoDia;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 15)
   private String descripcionDia;
}
