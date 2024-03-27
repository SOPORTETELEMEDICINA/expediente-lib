package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EventosView implements Serializable {
   private Long idEventos;
   private Long idUsuario;
   @NotNull(message = "No puede venir vacio")
   @Size(max = 60)
   private String titulo;
   @NotNull(message = "No puede venir vacio")
   private Date inicio;
   @NotNull(message = "No puede venir vacio")
   private Date fin;
   @Size(max = 255)
   private String ubicacion;
   @Size(max = 255)
   private String conferencia;
   private String descripcion;
   private Date alerta;
   private Boolean visible;
   private Long regionSanitaria;
   private String unidadMedica;
   private Integer status;
   private Long idUsuarioRecibe;
   private String idPaciente;
   private String especialidad;

   //   cuando el evento es una consulta debe existir una relacion
   private Long idConsulta;

   //   relaciones
   private Integer tipoEventoId;
   private Collection<InvitadosView> invitadosViewList = new ArrayList<>();

   //valores de retorno
   private String _eventoDescripcion;
   private String _eventoColor;
}
