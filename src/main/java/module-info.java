module com.project.helloworldjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.project.helloworldjavafx to javafx.fxml;
    opens com.project.helloworldjavafx.model.entities;
    exports com.project.helloworldjavafx;
    exports com.project.helloworldjavafx.model.entities;
}