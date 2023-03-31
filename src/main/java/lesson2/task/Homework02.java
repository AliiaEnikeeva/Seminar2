package lesson2.task;

import org.json.JSONArray;
import org.json.JSONException;


public class Homework02 {
    public static void splitArray() {
        try{
        JSONArray data = new JSONArray(("[{family:Иванов,score:5,lesson:Математика},{family:Петрова,score:4,lesson:Информатика},{family:Краснов,score:5,lesson:Физика}]"));
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
//            output.append("Студент ");
//            output.append(data.getJSONObject(i).get("family"));
//            output.append(" ");
//            output.append("получил ");
//            output.append(data.getJSONObject(i).get("score"));
//            output.append(" ");
//            output.append("по предмету ");
//            output.append(data.getJSONObject(i).get("lesson"));
//            output.append("\n\n");
            output.append("Студент ").append(data.getJSONObject(i).get("family")).append(" получил ").append(data.getJSONObject(i).get("score")).append(" по предмету ").append(data.getJSONObject(i).get("lesson")).append("\n\n");
        }

        System.out.print(output);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

}
