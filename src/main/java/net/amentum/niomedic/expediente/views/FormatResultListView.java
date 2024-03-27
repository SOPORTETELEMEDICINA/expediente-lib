package net.amentum.niomedic.expediente.views;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormatResultListView implements Serializable {
	private Long idFormatResult;
	private Date createdDate;
	private Map<String, Object> jsonAnswer;
	private String username;
	private Long idFormat;
	private Long idConsulta;
	@Override
	public String toString() {
		return "FormatResultListView {" +
				"idFormatResulta='" + idFormatResult + '\'' +
				", CreateDate='" + createdDate + '\'' +
				", jsonAnswer='" + jsonAnswer + '\'' +
				", unserName='" + username + '\'' +
				", idFormat='" + idFormat + '\'' +
				", idConsulta='" + idConsulta + '\'' +
				"}";
	}
	
}
