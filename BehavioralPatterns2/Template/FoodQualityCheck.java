package BehavioralPatterns2.Template;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking expiration date and composition.");
    }
}