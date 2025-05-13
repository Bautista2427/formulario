module co.edu.uniquindio.formulario.formularioapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.formulario.formularioapp to javafx.fxml;
    exports co.edu.uniquindio.formulario.formularioapp;
}