package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Container {
    String label;
    List<Box> boxes;

    public Container(String label, int numBoxes) {
        this.label = label;
        Random random = new Random();
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(6) + 5))
                .collect(Collectors.toList());
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}