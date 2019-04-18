package rockets.model;

class RocketValidation {


    public static void massToShouldBeNumbers(String massTo) {

        if (!(massTo.matches("[0-9]+"))) {
            throw new IllegalArgumentException("Ratio should be numbers") ;
        }
    }


}
