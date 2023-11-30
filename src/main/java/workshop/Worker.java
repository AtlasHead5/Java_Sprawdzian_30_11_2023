package workshop;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    public static void main(String[] args) {
        List<Tool> toolsList = new ArrayList<>();
        toolsList.add(new Tool("Młotek"));
        toolsList.add(new Tool("Śrubokręt"));
        toolsList.add(new Tool("Klucz Francuski"));

        for (Tool tool : toolsList) {
            tool.useTool();
        }
    }
}
