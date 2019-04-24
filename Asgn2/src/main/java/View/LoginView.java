package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LoginView extends Application {

	Stage stage;
	Scene scenefist;
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
        primaryStage.setTitle("Registration");
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);	
        scenefist = scene;
        primaryStage.setScene(scene);      
        primaryStage.show();	
	}

	 private GridPane createRegistrationFormPane() {
	        GridPane gridPane = new GridPane();	  
	        gridPane.setAlignment(Pos.CENTER);
	        gridPane.setPadding(new Insets(40, 40, 40, 40));
	        gridPane.setHgap(10);
	        gridPane.setVgap(10);
	        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
	        columnOneConstraints.setHalignment(HPos.RIGHT);
	        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
	        columnTwoConstrains.setHgrow(Priority.ALWAYS);
	        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
	        return gridPane;
	    }

	 private void addUIControlsScene(GridPane gridPane) {
	        Label headerLabel = new Label("Registration Form");
	        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
	        gridPane.add(headerLabel, 0,0,2,1);
	        GridPane.setHalignment(headerLabel, HPos.CENTER);
	        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

	     // Add Name Label
	        Label nameLabel = new Label("Name : ");
	        gridPane.add(nameLabel, 0, 2);
	        TextField nameField = new TextField();
	        nameField.setPrefHeight(40);
	        gridPane.add(nameField, 1, 2);
	        
	        // Add Email Label
	        Label emailLabel = new Label("Email ID : ");
	        gridPane.add(emailLabel, 0, 3);
	        TextField emailField = new TextField();
	        emailField.setPrefHeight(40);
	        gridPane.add(emailField, 1, 3);

	        // Add Password Label
	        Label passwordLabel = new Label("Password : ");
	        gridPane.add(passwordLabel, 0, 4);
	        PasswordField passwordField = new PasswordField();
	        passwordField.setPrefHeight(40);
	        gridPane.add(passwordField, 1, 4);
	        
	        // Add Cnp Label
	        Label cnpLabel = new Label("CNP : ");
	        gridPane.add(cnpLabel, 0, 5);
	        TextField cnpLabel1 = new TextField();
	        cnpLabel1.setPrefHeight(40);
	        gridPane.add(cnpLabel1, 1, 5);
	        
	        // Add Address Label 
	        Label addressLabel = new Label("Address : ");
	        gridPane.add(addressLabel, 0, 6);
	        TextField addressLabel1 = new TextField();
	        addressLabel1.setPrefHeight(40);
	        gridPane.add(addressLabel1, 1, 6);

	        // Add Group Label
	        Label groupLabel = new Label("Group : ");
	        gridPane.add(groupLabel, 0, 7);
	        TextField groupLabel1 = new TextField();
	        groupLabel1.setPrefHeight(40);
	        gridPane.add(groupLabel1, 1, 7);
	        
	        Button RegisterButton = new Button("Register");
	        RegisterButton.setPrefHeight(40);
	        RegisterButton.setDefaultButton(true);
	        RegisterButton.setPrefWidth(100);
	        gridPane.add(RegisterButton, 0, 8, 2, 1);
	        GridPane.setHalignment(RegisterButton, HPos.CENTER);
	        GridPane.setMargin(RegisterButton, new Insets(20, 0,20,0));

	        RegisterButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	   if(emailField.getText().isEmpty() ) {
	                       showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
	                       return;}
	                    if(nameField.getText().isEmpty()) {
		                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
		                    return;}
		                if(passwordField.getText().isEmpty()) {
			                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your password");
			                 return;}
			           if(cnpLabel1.getText().isEmpty()) {
					       showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your cnp");
					       return;    }        
					   if(addressLabel1.getText().isEmpty()) {
						  showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your address");
						  return;}		                
		           
	               
	            	String name = nameField.getText();
	            	String email = emailField.getText();
	            	String password = passwordField.getText();
	            	String cnp = cnpLabel1.getText();
	            	String address = addressLabel1.getText();
	                String group = groupLabel1.getText();
	            	
	                if(email.charAt(0)=='a' && email.charAt(1) == '.') {
	                	TeacherBll t = new TeacherBll(name,email,password,address,cnp); 
	                	t.adauga();
	                }
	                else {
	                	
	  	            	   if(groupLabel1.getText().isEmpty() ) {
	  	                       showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your group id");
	  	                       return;}
	  	            	   
	                	 
	                	StudentBll s = new StudentBll(name,email,password,address,cnp,group); 
	                	s.adauga();
	                }
	            }
	        });
	        
	        Button CloseButton = new Button("Close");
	        CloseButton.setPrefHeight(40);
	        CloseButton.setDefaultButton(true);
	        CloseButton.setPrefWidth(100);
	        gridPane.add(CloseButton, 0, 8, 2, 1);
	        GridPane.setHalignment(CloseButton, HPos.RIGHT);
	        GridPane.setMargin(CloseButton, new Insets(20, 0,20,0));
	        CloseButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {            
	            	  stage.setScene(scenefist);
	            	  stage.show();
	            }
	        });
	    
 }
	    
	    private void addUIControls(GridPane gridPane) {
	        // Add Header
	        Label headerLabel = new Label("Registration Form");
	        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
	        gridPane.add(headerLabel, 0,0,2,1);
	        GridPane.setHalignment(headerLabel, HPos.CENTER);
	        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

	        // Add Email Label
	        Label emailLabel = new Label("Email ID : ");
	        gridPane.add(emailLabel, 0, 2);

	        // Add Email Text Field
	        TextField emailField = new TextField();
	        emailField.setPrefHeight(40);
	        gridPane.add(emailField, 1, 2);

	        // Add Password Label
	        Label passwordLabel = new Label("Password : ");
	        gridPane.add(passwordLabel, 0, 3);

	        // Add Password Field
	        PasswordField passwordField = new PasswordField();
	        passwordField.setPrefHeight(40);
	        gridPane.add(passwordField, 1, 3);

	        // Add LoginButton Button
	        Button LoginButton = new Button("Login");
	        LoginButton.setPrefHeight(40);
	        LoginButton.setDefaultButton(true);
	        LoginButton.setPrefWidth(100);
	        gridPane.add(LoginButton, 0, 4, 2, 1);
	        GridPane.setHalignment(LoginButton, HPos.LEFT);
	        GridPane.setMargin(LoginButton, new Insets(20, 0,20,0));

	        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	
	            	GridPane gridPaneScene = createRegistrationFormPane();
	            	addUIControlsScene(gridPaneScene);
	            	 
	            	Scene sceneNew = new Scene(gridPaneScene, 800, 500);	
	     	        stage.setScene(sceneNew);	     	        
	     	        stage.show();
	            }
	        });
	    

	    
	 // Add SigninButton Button
     Button SigninButton = new Button("Signin");
     SigninButton.setPrefHeight(40);
     SigninButton.setDefaultButton(true);
     SigninButton.setPrefWidth(100);
     gridPane.add(SigninButton, 0, 4, 2, 1);
     GridPane.setHalignment(SigninButton, HPos.RIGHT);
     GridPane.setMargin(SigninButton, new Insets(20, 0,20,0));

     SigninButton.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
         	
             if(emailField.getText().isEmpty()) {
                 showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                 return;
             }
             if(passwordField.getText().isEmpty()) {
                 showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                 return;
             }
             String email = emailField.getText();
             if(email.charAt(0)=='a' && email.charAt(1) == '.') {
             	TeacherView tw = new TeacherView(email, passwordField.getText());
             	Stage sceneNew = stage ;
             	try {
						tw.start(sceneNew);
						showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Signin Successful!", "Welcome " + emailField.getText());
						sceneNew.show();
             	} catch (Exception e) {
						e.printStackTrace();
					}
             	
             	
             }
             else {
             	StudentView sw = new StudentView(email, passwordField.getText());
             	Stage sceneNew = stage ;
             	try {
						sw.start(sceneNew);
						showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Signin Successful!", "Welcome " + emailField.getText());
						sceneNew.show();
             	} catch (Exception e) {
						e.printStackTrace();
					}
             }
         
             
             
         }
     });
 }
	    
	    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
	        Alert alert = new Alert(alertType);
	        alert.setTitle(title);
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.initOwner(owner);
	        alert.show();
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
	 
}

