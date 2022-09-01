package day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FirstA {

    private List<SchoolEquipment> equipments = new ArrayList<>();

    public FirstA(Path path) {
        loadEquipments(path);
    }

    private void loadEquipments(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            createEquipment(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read the file", ioe);
        }
    }

    private void createEquipment(List<String> lines) {
        for (String line: lines) {
            String[] lineParts = line.split(";");
            int firstPart = Integer.parseInt(lineParts[0]);
            SchoolEquipment equipment = new SchoolEquipment(firstPart, lineParts[1], lineParts[2]);
            equipments.add(equipment);
        }
    }

    public List<SchoolEquipment> getEquipments() {
        return equipments;
    }
}
