public class Main {
    public static void main(String[] args) {
        PrinterController controller = new PrinterController();
        for (PrinterType type : PrinterType.values()) {
            controller.setConfig(type);
            controller.startPrinting();
        }
    }
}