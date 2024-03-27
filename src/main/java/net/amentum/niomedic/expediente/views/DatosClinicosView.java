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
public class DatosClinicosView implements Serializable {
    private Long idDatosClinicos;
    private String grupoSanguineo;
    private String factorRh;
    private String alergias;
    private String discapacidad;
    private String institucionSalud;
    private String nsss;
    private String idPaciente;
    private Date fechaCreacion;
    private Date ultimaModificacion;
    private String creadoPor;
    private Boolean activo;
}
