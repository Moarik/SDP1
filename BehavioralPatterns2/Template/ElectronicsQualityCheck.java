package BehavioralPatterns2.Template;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Checking functionality and warranty.");
    }
}