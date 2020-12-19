package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Creating a Text object
        Text command1_text = new Text();
        Text command2_text = new Text();
        Text score = new Text();
        Text timer = new Text();

        //Setting the text to be added.
        command1_text.setText("Команда 1");
        command2_text.setText("Команда 2");
        score.setText("Счет  1-2");
        timer.setText("таймер 57:44");

        //setting the position of the text
        command1_text.setX(15);
        command1_text.setY(50);

        command2_text.setX(500);
        command2_text.setY(50);

        score.setX(250);
        score.setY(50);

        timer.setX(250);
        timer.setY(100);

        Button incres_btn = new Button("Увеличить счет");
        incres_btn.setLayoutX(15);
        incres_btn.setLayoutY(180);

        Button incres_btn2 = new Button("Увеличить счет");
        incres_btn2.setLayoutX(450);
        incres_btn2.setLayoutY(180);


        Button start = new Button("Запуск");
        start.setLayoutX(180);
        start.setLayoutY(250);

        Button end = new Button("Конец");
        end.setLayoutX(350);
        end.setLayoutY(250);


        Button timer_start = new Button("запуск таймера");
        timer_start.setLayoutX(180);
        timer_start.setLayoutY(300);

        Button timer_end = new Button("перерыв");
        timer_end.setLayoutX(350);
        timer_end.setLayoutY(300);

        //Creating a Group object
        Group root = new Group(command1_text, command2_text, score, timer, incres_btn, incres_btn2, start, end, timer_start, timer_end);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Sample Application");
        stage.setScene(scene);
        stage.show();


        second_window();
        third_window();
    }

    public void second_window(){
        Text replaces = new Text();
        Text num_replaces = new Text();
        Text duration = new Text();
        Text timer = new Text();

        Text replaces_val = new Text();
        Text num_replaces_val = new Text();
        Text duration_val = new Text();
        Text timer_val = new Text();

        replaces.setText("Наличие замен");
        num_replaces.setText("Количество замен");
        duration.setText("Длительность перерыва");
        timer.setText("Знчение таймера");

        replaces_val.setText("Да");
        num_replaces_val.setText("2");
        duration_val.setText("300");
        timer_val.setText("00:00");


        replaces.setX(15);
        replaces.setY(50);

        num_replaces.setX(15);
        num_replaces.setY(100);

        duration.setX(15);
        duration.setY(150);

        timer.setX(15);
        timer.setY(200);


        replaces_val.setX(250);
        replaces_val.setY(50);

        num_replaces_val.setX(250);
        num_replaces_val.setY(100);

        duration_val.setX(250);
        duration_val.setY(150);

        timer_val.setX(250);
        timer_val.setY(200);


        Button edit = new Button("изменить");
        edit.setLayoutX(15);
        edit.setLayoutY(250);

        Button save = new Button("сохранить");
        save.setLayoutX(15);
        save.setLayoutY(300);





        //Creating a scene object
        Group root1 = new Group(replaces, replaces_val, num_replaces_val, num_replaces, duration_val, duration, timer, timer_val, edit, save);
        Scene scene1 = new Scene(root1, 300, 400);
        Stage secondStage = new Stage();
        secondStage.setTitle("Sample Application");
        secondStage.setScene(scene1);
        secondStage.show();
    }

    public void third_window(){

        Text team = new Text();
        Text score = new Text();
        Text winner = new Text();
        Text time1 = new Text();
        Text time2 = new Text();


        team.setText("Команда 1 - Команда 2");
        score.setText("Счет: 1-2");
        winner.setText("Победитель: Команда 2");
        time1.setText("1 тайм: 1-1");
        time2.setText("2 тайм: 1-2");


        team.setX(50);
        team.setY(25);

        score.setX(15);
        score.setY(100);

        winner.setX(15);
        winner.setY(150);

        time1.setX(15);
        time1.setY(200);

        time2.setX(15);
        time2.setY(250);




        Button close = new Button("закрыть");
        close.setLayoutX(15);
        close.setLayoutY(300);



        //Creating a scene object
        Group root2 = new Group(team, score, winner, time1, time2, close);
        Scene scene2 = new Scene(root2, 280, 350);
        Stage thirdStage = new Stage();
        thirdStage.setTitle("Sample Application");
        thirdStage.setScene(scene2);
        thirdStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
