public class PrinterController {
    Printer printer;

    private static void printSeparator() {
        System.out.print("-------------------------------------------------------------\n");
    }

    PrinterController() {
        printer = new Printer();
    }

    public void setConfig(PrinterType type) {
        printer.setPrinterType(type);
    }

    public void startPrinting() {
        printer.print();
        printSeparator();
    }
}
