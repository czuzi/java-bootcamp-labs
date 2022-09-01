package consultations.w02d05;

public class Prison {

    private boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < cells.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    cells[j] = !cells[j];
                }
            }
        }
        for (int i = 0; i < cells.length; i++) {
            if (cells[i]) {
                System.out.print((i + 1) + ", ");
            }
        }
    }
}
