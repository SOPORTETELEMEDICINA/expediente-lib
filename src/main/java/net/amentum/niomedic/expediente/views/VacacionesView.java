package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VacacionesView implements Serializable {
   private Long idVacaciones;
   //   private UUID medicoId;
   @NotNull(message = "No puede venir vacio")
   private Long idUsuario;
   //   @Size(max = 60)
//   private String nombreMedico;
   @Size(max = 100)
   private String nombreUsuario;
   //   @FutureOrPresent
   private Date inicio;
   //   @FutureOrPresent
   private Date fin;
}
