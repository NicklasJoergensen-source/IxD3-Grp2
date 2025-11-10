import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FrontendApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Klik mig!");
        btn.setOnAction(e -> System.out.println("Du klikkede på knappen"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Min Java Frontend");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void run(String[] args) {
        launch(args);
    }
}

//Hvad betyder de røde linjer?
//Det er advarsler (WARNING) fra JavaFX, ikke fejl. Din program kører fint (du kan se "Du klikkede på knappen" flere gange, og nederst står der Process finished with exit code 0, hvilket betyder succes).
//Advarslerne handler om:
//
//Restricted methods i java.lang.System og sun.misc.Unsafe
//Disse bruges internt af JavaFX til at håndtere grafik og hukommelse.
//Deprecation: Metoder som Unsafe.allocateMemory er forældede og vil blive fjernet i fremtidige Java-versioner.
//Forslag: Brug --enable-native-access=javafx.graphics for at undgå nogle advarsler.