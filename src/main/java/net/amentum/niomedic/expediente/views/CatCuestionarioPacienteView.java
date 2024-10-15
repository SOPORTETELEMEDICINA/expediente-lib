package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatCuestionarioPacienteView implements Serializable {
    Integer idCatCuestionarioPaciente;
    UUID idPaciente;
    Integer status;
    Integer idCatCuestionario;
}
