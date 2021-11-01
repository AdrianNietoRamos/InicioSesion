package dad.iniciosesion.ver;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VerView extends VBox{
private TextField usuarioText;
private PasswordField contrasenaText;
private CheckBox usarCheck;
private Button accederButton;
private Button cancelarButton;

public VerView() {
	super();
	usuarioText=new TextField();
	contrasenaText=new PasswordField();
	usarCheck=new CheckBox();
	accederButton=new Button();
	cancelarButton=new Button();
	
	HBox usuarioBox=new HBox(5, new Label("Usuario:"),usuarioText);
	
	
}
}
