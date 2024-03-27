package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.amentum.niomedic.catalogos.views.CatDolometroView;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EstadoSaludView implements Serializable {

   private Long idEstadoSalud;
   private String motivo;
   private Integer dolometroId;
   private Long idUsuario;
   private UUID idPaciente;
   private Date fechaCreacion;

   //valores de retorno
   private String _doloDescripcion;

   private CatDolometroView catDolometroView;
}
