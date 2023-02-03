public class Printer {
    private PrinterType printerType;

    public void setPrinterType(PrinterType type) {
        printerType = type;
    }

    public void print() {
        System.out.printf("Initializing printing with %s\n", printerType.getName());
        printerType.getStrategy().print();
        System.out.println("Printing completed");
    }
}
