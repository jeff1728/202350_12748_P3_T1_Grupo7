package application;

import javafx.fxml.FXML;



import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;


public class SampleController {
	int cantidad,precio,precioBuscar;
	private int remainingDataCount;
	Scanner leer=new Scanner(System.in);
	
	 @FXML
	    private Button btncomprar;

	    @FXML
	    private Button btningresar;

	    @FXML
	    private TextField txtcafe;

	    @FXML
	    private TextField txtcantidad;

	    @FXML
	    private TextField txtprecio;
	    
	    @FXML
	    private JFXButton fxingresar;
	    @FXML
	    private JFXTextArea txtArea;
	    
	    @FXML
	    private JFXButton fxcomprar;
	    
	    @FXML
	    private TextArea txtlistacafe;

	    @FXML
	    void fxingresar() {
	    	
	    	 cantidad=Integer.valueOf(txtcantidad.getText());
	    	 Grafo graph=new Grafo(cantidad);
		    	for(int i=0;i<cantidad;i++) {
					int dato1=Integer.valueOf( JOptionPane.showInputDialog("ingrese el dato 1: "));
					int dato2=Integer.valueOf( JOptionPane.showInputDialog("ingrese el dato 2: "));
					graph.addEdge(dato1, dato2);
				}
		    	System.out.println("Lista sin repeticiones: ");
		    	
		    	graph.DFSUtil(0);
	        
	    }
	    @FXML
	    void fxcomprar() {
	    	
	    	
	   
	    }
	    

	    
}
