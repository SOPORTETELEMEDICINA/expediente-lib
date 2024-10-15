package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatCuestionarioPacienteView implements Serializable {
    Integer idCatCuestionarioPaciente;
    String idPaciente;
    Integer status;
    Integer idCatCuestionario;
}
