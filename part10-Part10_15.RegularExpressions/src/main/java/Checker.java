public class Checker {
    
    public Checker(){}
    
    public boolean isDayOfWeek(String string) {
        if (string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
    
    public boolean allVowels(String string) {
        if (string.toLowerCase().matches("[aeiou]*")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
    
    public boolean timeOfDay(String string) {
        if (string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]|2[0-3]:[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
}
