module com.project.helloworldjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.project.helloworldjavafx to javafx.fxml;
    exports com.project.helloworldjavafx;
}