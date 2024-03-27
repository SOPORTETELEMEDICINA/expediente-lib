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
public class HorariosMedicionView implements Serializable {
   private Long idHorariosMedicion;
   private Date Hora;
   private UUID idPaciente;
//   relaciones
   private Integer catalogoMomentoId;
   private Integer catalogoDiaId;
//   valores de retorno
   private String _descripcionMomento;
   private String _descripcionDia;
}
