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
public class MedicionesPacienteView implements Serializable {
   private Long idMedicionesPaciente;
   private Date fechaCreacion;
   @NotNull(message = "No puede venir vacio")
   private UUID idPaciente;
   private Integer diabetes;
//   private Integer oximetria;
   private Integer oxSpo2;
   private Integer oxPr;
   private Integer hiperSistolica;
   private Integer hiperDiastolica;
   private Integer hiperPulso;
   @NotNull(message = "No puede venir vacio")
   private Long idUsuario;
   @Size(max = 255)
   private String nombrePaciente;
   @Size(max = 255)
   private String nombreUsuario;
   private Boolean fueraLimites;
   @NotNull
   private Long idPeriodoControles;
}
