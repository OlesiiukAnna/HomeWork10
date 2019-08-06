package home.Task_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
Нарисовать простую сцену - домик, солнце
 */
public class Task_10_1 extends Application {
    private static final int BOARD_WIDTH = 500;
    private static final int BOARD_HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SimpleGame");
        Canvas canvas = new Canvas();
        canvas.setWidth(BOARD_WIDTH);
        canvas.setHeight(BOARD_HEIGHT);

        BorderPane group = new BorderPane(canvas);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        test(gc);
    }

    private void test(GraphicsContext gc) {
        gc.setFill(Color.YELLOW);
        int diameter = 100;
        gc.fillOval(20, 20, diameter, diameter);

        gc.setFill(Color.DARKGREEN);
        gc.fillRect(0, 300, BOARD_WIDTH, BOARD_HEIGHT);

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(150, 150, 200, 200);

        gc.setFill(Color.SADDLEBROWN);
        gc.fillPolygon(new double[]{100, 250, 400},
                new double[]{170, 100, 170}, 3);

        gc.setFill(Color.BROWN);
        gc.setStroke(Color.SADDLEBROWN);
        gc.setLineWidth(3);
        gc.fillRect(160, 250, 50, 90);
        gc.strokeRect(160, 250, 50, 90);

        gc.setFill(Color.LIGHTBLUE);
        gc.setStroke(Color.SADDLEBROWN);
        gc.setLineWidth(3);
        gc.fillRect(250, 220, 60, 60);
        gc.strokeRect(250, 220, 60, 60);

        gc.setStroke(Color.SADDLEBROWN);
        gc.setLineWidth(3);
        gc.strokeLine(250, 250, 310, 250);

        gc.setStroke(Color.SADDLEBROWN);
        gc.setLineWidth(3);
        gc.strokeLine(280, 220, 280, 280);
    }
}