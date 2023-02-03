public enum PrinterType {
    InkJet("InkJet printer", new BlackWhitePrint()),
    Laser("Laser printer", new ColorPrint()),
    LED("LED printer", new ColorPrint()),
    DotMatrix("Dot matrix printer", new BlackWhitePrint()),
    ThreeDimensional("3D printer", new ThreeDimensionalPrint());

    private final String name;

    private final PrintingStrategy strategy;

    PrinterType(String name, PrintingStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public PrintingStrategy getStrategy() {
        return strategy;
    }


}

