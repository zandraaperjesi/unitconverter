class UnitConverter {

    double convertFromTo(double value, String changeFrom, String changeTo) {
        double fromProp = changeFrom.length() > 1 ? metric(changeFrom.substring(0, changeFrom.length() - 1)) : 1;
        double toProp = changeTo.length() > 1 ? metric(changeTo.substring(0,changeTo.length() - 1)) : 1;
        return value * fromProp / toProp;
    }

    private double metric(String metricString) {
        switch(metricString) {
            case "t": return 1000000000000L;
            case "g": return 1000000000;
            case "M": return 1000000;
            case "k": return 1000;
            case "h": return 100;
            case "da": return 10;
            case "d": return 0.1;
            case "c": return 0.01;
            case "m": return 0.001;
            case "µ": return 0.000001;
            case "n": return 0.000000001;
            default: return -1;
        }
    }
}
