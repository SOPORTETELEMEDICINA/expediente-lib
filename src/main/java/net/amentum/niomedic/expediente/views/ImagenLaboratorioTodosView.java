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
public class ImagenLaboratorioTodosView implements Serializable {

    private Long idImagenLaboratorio;
    private String contentType;
    private String imageName;
    private String idPaciente;
    private Date fechaCreacion;
    private Long consultaId;
    private Boolean activo;
}
