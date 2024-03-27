package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NotificacionesView implements Serializable {
   private Long idNotificaciones;
   @NotBlank(message="Es un campo requerido, no puede ser null/vacío")
   private String tipo;
   @NotNull(message = "Es un campo requerido, no puede ser null/vacío")
   private Long idUsuario;
   @NotBlank(message="Es un campo requerido, no puede ser null/vacío")
   @Size(max = 100)
   private String subject;
   @Size(max = 255)
   private String descripcion;
   private Date _fechaCreacion;
   private Date fechaEnvio;
   private Date fechaLeido;
   private Date fechaBorrado;
   private String adjuntos;
   private String accion;
   private Integer prioridad;
   private Integer estatus;
}
