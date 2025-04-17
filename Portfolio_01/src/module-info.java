module Portfolio_01 {
	requires java.sql;
	requires javafx.base ;
	requires javafx.controls;
	requires javafx.fxml; // FXML 설정
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens application.DTO to javafx.base;
}
