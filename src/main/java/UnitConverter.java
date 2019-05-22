class UnitConverter {

    double convertFromTo(double value, String changeFrom, String changeTo) {
        double fromProp = changeFrom.length() == 2 ? metric(changeFrom.charAt(0)) : 1;
        double toProp = changeTo.length() == 2 ? metric(changeTo.charAt(0)) : 1;
        return value * fromProp / toProp;
    }

    private double metric(char metricString) {
        switch(metricString) {
            case 't': return 1000000000000L;
            case 'g': return 1000000000;
//            case "mega": return 1; colliding with `milli`
            case 'k': return 1000;
            case 'h': return 100;
//            case "deca": return 1; colliding with `deci`
            case 'd': return 0.1;
            case 'c': return 0.01;
            case 'm': return 0.001;
            case 'µ': return 0.000001;
            case 'n': return 0.000000001;
            default: return -1;
        }
    }
}
