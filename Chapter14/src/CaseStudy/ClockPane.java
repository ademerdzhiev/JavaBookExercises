package CaseStudy;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    public ClockPane() {
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public  int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        painClock();
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        painClock();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        painClock();
    }

    private void painClock() {
        double clockRadius = Math.min(getWidth(), getHeight())*0.8*0.5;
        double centerX = getWidth()/2;
        double centerY = getHeight()/2;

//        Draw cirle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX -clockRadius + 3, centerY +5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY - 3, "3");
        Text t4 = new Text(centerX -3, centerY + clockRadius -3, "6");

//        DRAW SECOND HAND
        double sLength = clockRadius*0.8;
        double secondX = centerX + sLength*Math.sin(second*(2*Math.PI/60));
        double secondY = centerY - sLength*Math.cos(second*(2*Math.PI/60));

        Line sline = new Line(centerX, centerY, secondX, secondY);
        sline.setStroke(Color.RED);

//        DRAW MINUTE HAND
        double mLength = clockRadius*0.65;
        double xMinute = centerX + mLength*Math.sin(minute*(2*Math.PI/60));
        double yMinute = centerY - mLength*Math.cos(minute*(2*Math.PI/60));
        Line mLine = new Line(centerX, centerY, xMinute, yMinute);
        mLine.setStroke(Color.GREEN);

//        DRAW HOUR HAND
        double hLength = clockRadius*0.5;
        double hourX = centerX + hLength*Math.sin((hour%12 + minute/60)*(2*Math.PI/12));
        double hourY = centerY - hLength*Math.cos((hour%12 + minute/60)*(2*Math.PI/12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.BLUE);

        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sline, mLine, hLine);



    }
}
