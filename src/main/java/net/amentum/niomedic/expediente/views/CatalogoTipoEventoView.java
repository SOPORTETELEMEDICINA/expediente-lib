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
public class CatalogoTipoEventoView implements Serializable {
   private Integer idTipoEvento;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 60)
   private String descripcion;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 7)
   private String color;
}
