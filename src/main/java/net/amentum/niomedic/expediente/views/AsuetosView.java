package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsuetosView implements Serializable {
   private Long idAsuetos;
   //   @FutureOrPresent
   private Date fecha;
   //   @FutureOrPresent
//   private Date fin;
   private Boolean obligatorio;
}
