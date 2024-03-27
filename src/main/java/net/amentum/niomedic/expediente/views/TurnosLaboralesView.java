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
public class TurnosLaboralesView implements Serializable {
   private Long idTurnosLaborales;
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
   private Boolean lunes;
   private Boolean martes;
   private Boolean miercoles;
   private Boolean jueves;
   private Boolean viernes;
   private Boolean sabado;
   private Boolean domingo;
}
