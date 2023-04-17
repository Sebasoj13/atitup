package conexion;


import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.edit.EditChoice;
import com.theokanning.openai.edit.EditRequest;
import java.util.List;

public class ConexionChatGPT {
  public static String conexion(String pPregunta){
	  var service = new OpenAiService("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");
	  var request = EditRequest.builder()
		        .model("text-davinci-edit-001")
		        .input(pPregunta)
		        .instruction("Responder pregunta y explicar respuesta")
		        .build();
	  String respuesta = "";
	  service.createEdit(request).getChoices();
	  List<EditChoice> choices = service.createEdit(request).getChoices();
	  for(EditChoice choice: choices){
		  respuesta += choice.toString() + "\n";
	  }
	  return respuesta;
  	}
  
  
}

	