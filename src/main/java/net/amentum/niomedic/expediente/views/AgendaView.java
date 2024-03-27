package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgendaView implements Serializable {
   private Long idAgenda;
   @NotNull(message = "No puede venir vacio")
   private UUID medicoId;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 60)
   private String nombreMedico;
   @NotNull(message = "No puede venir vacio")
   private UUID pacienteId;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 60)
   private String nombrePaciente;
//   @FutureOrPresent
   private Date inicio;
//   @FutureOrPresent
   private Date fin;
   private Boolean visible;
   private Boolean disponible;
   @Size(max = 100)
   private String ubicacion;
   @Size(max = 600)
   private String datosBusqueda;
   //relaciones
   private Integer tipoEventoId;
   //valores de retorno
   private String _eventoDescripcion;
   private String _eventoColor;


}
