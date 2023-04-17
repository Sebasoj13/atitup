package vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import conexion.ConexionChatGPT;
import conexion.ConexionDB;
import conexion.Prompt;

public class main {
	public static void main(String[] args) {
        ArrayList<Prompt> listaPrompts = new ArrayList<Prompt>();
        
        Scanner scanner = new Scanner(System.in);
        String input;
        String categoria;
        
        while (true) {
            System.out.print("(Digite 1 si desea salir)\nIngrese su pregunta: \n ");
            input = scanner.nextLine();
            
            

            if (input.equals("1")) {
                break;
            }
            else if(input.equalsIgnoreCase("")){
                System.out.println("Debe de ingresar una pregunta");

            }
            else {
                System.out.print("Ingrese la categoría de la pregunta: \n");
                categoria = scanner.nextLine();
                
                Prompt prompt = new Prompt(categoria, input);
                prompt.registrarPrompt(listaPrompts);
                
                System.out.println(ConexionChatGPT.conexion(input));
                
                System.out.println(listaPrompts.get(listaPrompts.size()-1).getNumeroPrompt());
            }
        }
    }
}
